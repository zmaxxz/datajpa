package demo.datajpa;

import demo.datajpa.util.EventFromAction;
import lombok.SneakyThrows;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.SpendingBotApi;
import org.openapitools.client.model.OrganizationInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Component

public class Actions {

    @Bean
    public Action<String, String> firstInitialAction() {
        return new Action<String, String>() {
            @Override
            public void execute(StateContext<String, String> context) {
                String stateKey= context.getStateMachine().getInitialState().getId();
                EventFromAction.getAvailableTargetStates(context.getStateMachine(),stateKey);
                String text = "Вітаємо тебе новий користувач " + stateKey;
                System.out.println(text);
            }
        };
    }
    @Bean
    public Action<String, String> enterAction() {
        return new Action<String, String>() {
            @Override
            public void execute(StateContext<String, String> context) {
                String stateKey= context.getStateMachine().getState().getId();
                String stateConfigMessage=StateConfigMap.map.get(stateKey).messages.onEnter;
                String text = stateConfigMessage +" "+ stateKey;
                EventFromAction.onEnterMessage= text!=null?text:"onEnterMessage=null check -> " + stateKey;
                EventFromAction.getAvailableTargetStates(context.getStateMachine(),stateKey);
                System.out.println(text);
            }
        };
    }
    @Bean
    public Action<String, String> inputCodeAction() {
        return new Action<String, String>() {
            @Override
            public void execute(StateContext<String, String> context) {
                String code = context.getMessageHeaders().get("text").toString();
                System.out.println(code);

//                Message<String> eventMessage = MessageBuilder
//                        .withPayload(Events.WS_REQUEST)
//                        .setHeader("edrpou", code)
//                        .build();
//                context.getStateMachine().sendEvent(Mono.just(eventMessage)).subscribe();
            }
        };
    }
    @Bean
    public Action<String, String> requestAction() {
        return new Action<String, String>() {
            @SneakyThrows
            @Override
            public void execute(StateContext<String, String> context) {

                String edrpou = context.getMessageHeaders().get("text").toString();
                String stateKey = context.getStateMachine().getState().getId();
                String classModelString = StateConfigMap.map.get(stateKey).request.classModelString;
                String method = StateConfigMap.map.get(stateKey).request.method;
                String expressionString =StateConfigMap.map.get(stateKey).request.expressionString;
                String searchParam1 = edrpou;
//                String searchParam1 = "05498789";


//                String classModelString = "org.openapitools.client.api.SpendingBotApi";
//                String method = "getDisposerUsingGET";
//                String searchParam1 = edrpou;
////                String searchParam1 = "05498789";
//                String expressionString = "'<b>Код за ЄДРПОУ</b>  -  ' + edrpou + " +
//                        "'\n<b>Категорія суб''єкта</b>  -  ' + orgType + " +
//                        "'\n<b>Код за КОПФГ</b>  -  ' + kopfg + ' - ' + orgForm +" +
//                        "'\n<b>Код за КВЕД (основний)</b>  -  ' + kved + ' - ' + kvedName + " +
//                        "'\n<b>Код за КОАТУУ</b>  -  ' + koatuu + " +
//                        "'\n<b>Місцезнаходження</b>  -  ' + address + " +
//                        "'\n<b>Керівник</b>  -  ' + director + " +
//                        "'\n<b>Кабінет</b>  -  ' + state";

                Class classModelClass = Class.forName(classModelString);
                Constructor classConstructor = classModelClass.getConstructor();
                Object newInstance = classConstructor.newInstance();

                Class[] cArg = new Class[1];
                cArg[0] = String.class;
                Method resultMetod = newInstance.getClass().getMethod(method, cArg);
                Object result1 = resultMetod.invoke(newInstance, searchParam1);
                SpelExpressionParser parser1 = new SpelExpressionParser();
                String message1 = parser1.parseRaw(expressionString).getValue(result1).toString();


                EventFromAction.onEnterMessage= message1;

                EventFromAction.getAvailableTargetStates(context.getStateMachine(),stateKey);
                System.out.println(message1);



//                Message<String> responseEventMessage = MessageBuilder
//                        .withPayload(Events.WS_RESPONSE)
//                        .build();
//
//                context.getStateMachine().sendEvent(Mono.just(responseEventMessage)).subscribe();

            }


        };
    }
}

