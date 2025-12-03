package coreJava.DSA.character;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        String str = "abcdaaaff";

        List<String> list = Arrays.asList(str.split(""));
        Map<String, Long> result = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result);
    }
}