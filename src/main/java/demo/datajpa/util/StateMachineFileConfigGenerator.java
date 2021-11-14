package demo.datajpa.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public final class StateMachineFileConfigGenerator {


    public static void generateFrom() throws IOException {
        final Resource[] possiblePropertiesResources = ResourcePatternUtils.getResourcePatternResolver(new ResourceLoader() {
            @Override
            public Resource getResource(String location) {
                return null;
            }

            @Override
            public ClassLoader getClassLoader() {
                return null;
            }
        }).getResources("classpath*:configurerStateMachine/**/*.json");


        JSONArray obj = new JSONArray();
        try {
            for (Resource res : possiblePropertiesResources) {
                obj.addAll((JSONArray) new JSONParser().parse(new FileReader(res.getFile().toString())));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Collections.sort(obj, new MyJSONComparator());
        //Collections.checkedList(List.of(obj.toArray()), StateConfig.class);
        String stringObject = obj.toJSONString();
        StateConfigGenerator.generateStateConfig(stringObject);

//        for (Object object : obj) {
//            object.getClass().si
//        }
//        System.out.println(StateConfigMap.map.toString());
            try {
                FileWriter file = new FileWriter("src/main/resources/statemachine_config.json", false);

                obj.writeJSONString(obj, file);
                file.close();
                System.out.println("done");
            } catch (Exception e) {

                e.getMessage();

            }
//        SpendingBotApi
//        System.out.println(Organi);
        }
        static class MyJSONComparator implements Comparator<JSONObject> {

            @Override
            public int compare(JSONObject o1, JSONObject o2) {
                String v1;
                try {
                    v1 = o1.get("@id").toString();
                } catch (Exception e) {
                    return 0;
                }
                String v3;
                try {
                    v3 = o2.get("@id").toString();
                } catch (Exception e) {
                    return -1;
                }

                return v1.compareTo(v3);
            }

        }
    }
