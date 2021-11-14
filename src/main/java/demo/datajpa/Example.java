package demo.datajpa;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.DwhApi;
import org.openapitools.client.api.SpendingBotApi;
import org.openapitools.client.model.OrganizationInfoDTO;
import org.openapitools.client.model.PdvAggregateDto;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.statemachine.config.model.StateMachineModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {




    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");
//        String classModelString = "org.openapitools.client.api.SpendingBotApi";
//        Class classModelClass=Class.forName(classModelString);
//        Constructor classConstructor = classModelClass.getConstructor();
//        Object risultato = classConstructor.newInstance();
        SpendingBotApi spendingBotApi= new SpendingBotApi(defaultClient);
        String searchParam1 = "05498789";
        String expressionString ="'<b>Код за ЄДРПОУ</b>  -  ' + edrpou + " +
                "'\n<b>Категорія суб''єкта</b>  -  ' + orgType + " +
                "'\n<b>Код за КОПФГ</b>  -  ' + kopfg + ' - ' + orgForm +" +
                "'\n<b>Код за КВЕД (основний)</b>  -  ' + kved + ' - ' + kvedName + " +
                "'\n<b>Код за КОАТУУ</b>  -  ' + koatuu + " +
                "'\n<b>Місцезнаходження</b>  -  ' + address + " +
                "'\n<b>Керівник</b>  -  ' + director + " +
                "'\n<b>Кабінет</b>  -  ' + state";



        try {
            OrganizationInfoDTO result ;
//            Class[] cArg = new Class[1];
//            cArg[0] = String.class;
//            Method resultMetod = risultato.getClass().getMethod("getDisposerUsingGET", cArg);
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//            String result1=resultMetod.invoke(risultato,searchParam1).toString();
//           // System.out.println(result1);
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            result = spendingBotApi.getDisposerUsingGET(searchParam1);
//
//            System.out.println( "<b>Код за ЄДРПОУ</b>  -  " + result.getEdrpou() +
//                                "\n<b>Категорія суб'єкта</b>  -  " + result.getOrgType() +
//                                "\n<b>Код за КОПФГ</b>  -  " + result.getKopfg() + " - " + result.getOrgForm() +
//                                "\n<b>Код за КВЕД (основний)</b>  -  " + result.getKved() + " - " + result.getKvedName() +
//                                "\n<b>Код за КОАТУУ</b>  -  " + result.getKoatuu() +
//                                "\n<b>Місцезнаходження</b>  -  " + result.getAddress() +
//                                "\n<b>Керівник</b>  -  " + result.getDirector() +
//                                "\n<b>Кабінет</b>  -  " + result.getState());
//            System.out.println();
//            System.out.println(result);
//            StandardEvaluationContext stContext  = new StandardEvaluationContext(result);
            SpelExpressionParser parser = new SpelExpressionParser();

            String message = parser.parseRaw(expressionString).getValue(result).toString();
            System.out.println(message);
            System.out.println();
            System.out.println(expressionString);
        } catch (ApiException e) {
            System.err.println("Exception when calling DwhApi#getAggregateResultUsingGET");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }


    }
}
