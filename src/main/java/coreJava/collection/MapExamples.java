package coreJava.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Id", 101);

        System.out.println(map.containsKey("Id"));    // true
        System.out.println(map.containsValue(101));   // true
        System.out.println(map.containsKey("Age"));   // false

    }

}