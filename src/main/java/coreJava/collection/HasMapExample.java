package coreJava.collection;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println(map);

        //
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 1);
        map1.put("Python", 2);
        map1.put("C++", 3);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // hash map with dublicate key

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Java");
        map3.put(1, "Python");   // overwrites Java

        System.out.println(map3);  // {1=Python}
    }

}