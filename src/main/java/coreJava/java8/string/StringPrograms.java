package coreJava.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StringPrograms {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("amit", "ashu", "amul", "child","cha", "durgesh");
        Map<Object, List<String>> result = strList.stream().collect(Collectors.groupingBy(c ->c.charAt(0)));
        System.out.println(result);

        String str = "aman";
        List<String> input = Arrays.asList(str);
        long result1 = input.stream().map(c -> c.toCharArray()).count();
        System.out.println(result1);
    }
}