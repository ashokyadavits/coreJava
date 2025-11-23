package coreJava.java8.string;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamStringOps {

    public static void main(String[] args) {
        String str = "programming";
        

        Map<Character, Long> res = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(res);

        String rem = str.chars().mapToObj(c -> (char) c).distinct().map(String::valueOf).collect(Collectors.joining());
        System.out.println(rem);

    }
}