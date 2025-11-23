package coreJava.string;

import java.util.*;
import java.util.stream.Collectors;

 class Demo12 {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        List<Character> input = inputString.chars().mapToObj(c -> (char) c).filter(c -> !Character.isWhitespace(c)).collect(Collectors.toList());
        System.out.println(input);
        char result = input.stream().filter(n -> Collections.frequency(input, n) == 1).findFirst().orElseThrow();
        System.out.println(result);

    }
}