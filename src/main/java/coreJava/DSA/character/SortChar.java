package coreJava.DSA.character;

import java.util.stream.Collectors;

public class SortChar {
    public static void main(String[] args) {
        String str = "acdsvb";
        String result = str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(result);
    }
}