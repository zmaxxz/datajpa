package demo.datajpa.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import demo.datajpa.StateConfig;
import demo.datajpa.StateConfigMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class StateConfigGenerator {

    public static void generateStateConfig(String jsonString) throws JsonProcessingException {
        String fieldName = "config";
        final List<ObjectNode> node1 = new ObjectMapper().readValue(jsonString, new TypeReference<List<ObjectNode>>() {
        });
        List<String> obj = new LinkedList<>();
        for (ObjectNode objectNode : node1) {
            if (objectNode.has(fieldName)) {
                obj.add(objectNode.get(fieldName).toString());
            }
        }
        System.out.println("someArray: " + obj);
        for (String objectString : obj) {
            Map<String, StateConfig> map = new ObjectMapper().readValue(objectString, new TypeReference<Map<String, StateConfig>>() {});
            StateConfigMap.map.putAll(map);
        }
    }
}
