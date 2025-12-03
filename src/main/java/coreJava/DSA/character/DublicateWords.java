package coreJava.DSA.character;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicateWords {

    public static void main(String[] args) {
        String str = "aabcdee";

        List<String> list = Arrays.asList(str.split(""));

        List<String> result = list.stream().distinct().filter(n -> Collections.frequency(list, n) >1).toList();
        System.out.println(result);

        // not repeating
        List<String> result1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue() ==1).map(Map.Entry :: getKey).toList();

        System.out.println(result1);
    }
}