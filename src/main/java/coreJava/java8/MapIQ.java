package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIQ {


    public static void main(String[] args) {
        Map<String, Double> input = new HashMap<>();
        input.put("ashok", 6.6);
        input.put("kumar", 2.2);
        input.put("manm", 3.8);

        Map<String,Double> result = input.entrySet().stream().filter(n -> n.getValue() >2)
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
        System.out.println(result);

    }
}
