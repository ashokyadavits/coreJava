package coreJava.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitWordsFirstChar {
    public static void main(String[] args) {
        String str = "java is a !programming <language";
        List<String> str1 = Arrays.asList(str.split(" "));
        List<Character> result = str1.stream().map( n -> n.replaceAll("[^a-zA-Z]", "")).
                filter( n -> !n.isEmpty()).map(n -> n.charAt(0)).toList();
        System.out.println(result);
    }
}