package coreJava.DSA.character;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "java is best";

        List<String> list = Arrays.asList(str.split(" "));
        String reverse = list.stream().map(n -> new StringBuilder(n).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}