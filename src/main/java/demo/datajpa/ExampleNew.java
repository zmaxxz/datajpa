package demo.datajpa;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.SpendingBotApi;
import org.openapitools.client.model.OrganizationInfoDTO;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleNew {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String classModelString = "org.openapitools.client.api.SpendingBotApi";
        String method = "getDisposerUsingGET";
        String searchParam1 = "05498789";
        String expressionString = "'<b>Код за ЄДРПОУ</b>  -  ' + edrpou + " +
                "'\n<b>Категорія суб''єкта</b>  -  ' + orgType + " +
                "'\n<b>Код за КОПФГ</b>  -  ' + kopfg + ' - ' + orgForm +" +
                "'\n<b>Код за КВЕД (основний)</b>  -  ' + kved + ' - ' + kvedName + " +
                "'\n<b>Код за КОАТУУ</b>  -  ' + koatuu + " +
                "'\n<b>Місцезнаходження</b>  -  ' + address + " +
                "'\n<b>Керівник</b>  -  ' + director + " +
                "'\n<b>Кабінет</b>  -  ' + state";


        Class classModelClass = Class.forName(classModelString);
        Constructor classConstructor = classModelClass.getConstructor();
        Object newInstance = classConstructor.newInstance();

//        ApiClient defaultClient = Configuration.getDefaultApiClient();
//        defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");
//        SpendingBotApi spendingBotApi = new SpendingBotApi(defaultClient);


        Class[] cArg = new Class[1];
        cArg[0] = String.class;
        Method resultMetod = newInstance.getClass().getMethod(method, cArg);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Object result1 = resultMetod.invoke(newInstance, searchParam1);
        System.out.println(result1.toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        SpelExpressionParser parser1 = new SpelExpressionParser();
        String message1 = parser1.parseRaw(expressionString).getValue(result1).toString();
        System.out.println(message1);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


//            OrganizationInfoDTO result;
//            result = spendingBotApi.getDisposerUsingGET(searchParam1);
//            SpelExpressionParser parser = new SpelExpressionParser();
//            String message = parser.parseRaw(expressionString).getValue(result).toString();
//            System.out.println(message);

//            StandardEvaluationContext stContext = new StandardEvaluationContext(result);

//            System.out.println();
//            System.out.println(expressionString);
//
//            System.out.println( "<b>Код за ЄДРПОУ</b>  -  " + result.getEdrpou() +
//                    "\n<b>Категорія суб'єкта</b>  -  " + result.getOrgType() +
//                    "\n<b>Код за КОПФГ</b>  -  " + result.getKopfg() + " - " + result.getOrgForm() +
//                    "\n<b>Код за КВЕД (основний)</b>  -  " + result.getKved() + " - " + result.getKvedName() +
//                    "\n<b>Код за КОАТУУ</b>  -  " + result.getKoatuu() +
//                    "\n<b>Місцезнаходження</b>  -  " + result.getAddress() +
//                    "\n<b>Керівник</b>  -  " + result.getDirector() +
//                    "\n<b>Кабінет</b>  -  " + result.getState());
//            System.out.println();
//            System.out.println(result);


    }
}
