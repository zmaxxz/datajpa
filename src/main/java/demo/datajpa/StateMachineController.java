/*
 * Copyright 2016-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo.datajpa;

import demo.datajpa.util.EventFromAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.StateMachinePersist;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.statemachine.data.RepositoryTransition;
import org.springframework.statemachine.data.TransitionRepository;
import org.springframework.statemachine.service.StateMachineService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;

import java.util.*;

@Controller
public class StateMachineController {

	private final StateMachineLogListener listener = new StateMachineLogListener();
	@Autowired
	private StateMachineService<String, String> stateMachineService;

	@Autowired
	private StateMachinePersist<String, String, String> stateMachinePersist;

	@Autowired
	private TransitionRepository<? extends RepositoryTransition> transitionRepository;

	private StateMachine<String, String> currentStateMachine;

	@RequestMapping("/")
	public String home() {
		return "redirect:/state";
	}

	private StateMachine<String,String> sm;

	@RequestMapping("/state")
	public String feedAndGetStates(@RequestParam(value = "events", required = false) String events,
								   @RequestParam(value = "inputText", required = false) String inputText,
								   Model model) throws Exception {
		String machine="11";
		sm = getStateMachine(machine);
		if (events != null) {
				String eventStateMachine=convertEventButtonToEventStateMachine(events);
				sm.sendEvent(Mono.just(MessageBuilder
						.withPayload(eventStateMachine).build()))
					.blockLast();
		} else if (inputText != null)
		{
			sm.sendEvent(Mono.just(MessageBuilder
							.withPayload("SAY")
							.setHeader("text", inputText)
							.build()))
					.subscribe();
			System.out.println();
		}

		model.addAttribute("allEvents", getTargetState());
		model.addAttribute("messages", createMessages(listener.getMessages()));
		return "states";
	}

	private String convertEventButtonToEventStateMachine(String eventButton) {
		for (StateConfig stateConfig : StateConfigMap.map.values()) {
			if (stateConfig.button.equals(eventButton)){

				return stateConfig.transitionTargetStateEvent;
			}
		}
		//todo переделать в log
		System.out.println("!!!!!! что-то пошло не так !!!!!!  Смотри StateMachineController.convertEventButtonToEventStateMachine");
		return eventButton;
	}

	private String[] getTargetState() {
		List<String> events = new ArrayList<>();
		for (String state : EventFromAction.availableTargetStates) {
			events.add(StateConfigMap.map.get(state).button);
		}
		return events.toArray(new String[0]);
	}

	private String createMessages(List<String> messages) {
		StringBuilder buf = new StringBuilder();
		for (String message : messages) {
			buf.append(message);
			buf.append("\n");
		}buf.append("\n");
		buf.append(EventFromAction.onEnterMessage);
		return buf.toString();
	}

	private synchronized StateMachine<String, String> getStateMachine(String machineId) throws Exception {
		listener.resetMessages();
		if (currentStateMachine == null) {
			currentStateMachine = stateMachineService.acquireStateMachine(machineId, false);
			currentStateMachine.addStateListener(listener);
			currentStateMachine.startReactively().block();
		} else if (!ObjectUtils.nullSafeEquals(currentStateMachine.getId(), machineId)) {
			stateMachineService.releaseStateMachine(currentStateMachine.getId());
			currentStateMachine.stopReactively().block();
			currentStateMachine = stateMachineService.acquireStateMachine(machineId, false);
			currentStateMachine.addStateListener(listener);
			currentStateMachine.startReactively().block();
		}
		return currentStateMachine;
	}

}
