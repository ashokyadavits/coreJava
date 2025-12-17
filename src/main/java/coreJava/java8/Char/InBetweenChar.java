package coreJava.java8.Char;

import java.util.Arrays;
import java.util.List;

public class InBetweenChar {
    public static void main(String[] args) {
        String str = "abcdef";
        List<String> strList = Arrays.asList(str.split(""));
        List<String> result = strList.stream().filter(n -> n.charAt(0) >'a'  && n.charAt(0) < 'f').toList();
        System.out.println(result);

        List<Character>  result1 = str.chars().mapToObj( c -> (char) c).filter(n -> n >'b' && n < 'f').toList();
        System.out.println(result1);

    }
}