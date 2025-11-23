package coreJava.java8.Char;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingChar {
    public static void main(String[] args) {

        String str = "abfdsc";
        List<String> list = Arrays.asList(str.split(""));
        List<String> result = list.stream().sorted().toList();
        System.out.println(result);

        // in desc order

        String str1 = "bdcaaf";
        String sortedDesc = str1.chars().boxed().sorted((a, b) -> b - a)
                .map(c -> String.valueOf((char) c.intValue())).collect(Collectors.joining());
        System.out.println(sortedDesc);
    }
}