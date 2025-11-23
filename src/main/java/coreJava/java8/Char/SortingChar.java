package coreJava.java8.Char;

import java.util.Arrays;
import java.util.List;

public class SortingChar {
    public static void main(String[] args) {

        String str = "abfdsc";
        List<String> list = Arrays.asList(str.split(""));
        List<String> result = list.stream().sorted().toList();
        System.out.println(result);
    }
}