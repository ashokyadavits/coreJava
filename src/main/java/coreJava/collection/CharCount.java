package coreJava.collection;

import java.util.function.Function;
import java.util.stream.Collectors;

class CharCount {

    public static void main(String[] args) {

        String input = "Hello World";
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                count++;
            }
        }
        System.out.println("Total characters (excluding spaces): " + count);

        // second way -

        String input1 = "Hello World";
        int count1 = input.length();
        System.out.println("Total characters (including spaces): " + count1);

        // java8

        String input2 = "banana";
        var result = input2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(result);

    }
}