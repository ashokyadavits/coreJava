package coreJava.java8.Char;

import java.util.*;
import java.util.stream.Collectors;

public class FirtNonRepeatingChar {
    public static void main(String[] args) {
        String str = "abcabefg";
        List<String> list = Arrays.asList(str.split(""));
        String result = list.stream().filter(n -> Collections.frequency(list, n) == 1).findFirst().orElseThrow(null);
        System.out.println(result);

        // best approach

        String str1 = "abcabefg";
        String result1 = Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(result1);

    }
}