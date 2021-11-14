package demo.datajpa.util;

import org.springframework.statemachine.StateMachine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public final class EventFromAction {
    public static String onEnterMessage;
    public static Collection<String> availableTargetStates;



    public static void getAvailableTargetStates(StateMachine<String, String> sm, String targetState){
         availableTargetStates = sm.getTransitions()
                .stream()
                .filter(p -> p.getSource().getId().equals(targetState))
                .filter(p -> p.getKind().name().equals("EXTERNAL"))
                .map(p -> p.getTarget().getId())
                .collect(Collectors.toCollection(ArrayList::new));
    }



}
