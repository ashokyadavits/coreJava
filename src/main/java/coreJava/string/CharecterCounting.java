package coreJava.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharecterCounting {
    public static void main(String[] args){
        String str = "Java is object oriented language";

        Map<Character,Integer> charCounting = new HashMap<>();
        for(Character ch: str.toCharArray()){
            charCounting.put(ch,charCounting.getOrDefault(ch,0)+1);
        }
        System.out.println(charCounting);


        Map<String, Long> count = Arrays.stream(str.split("")).filter(n -> !n.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);



       // 1- COunt the  haracter in string

        String countStrig = "abcabcd";

        Map<Character, Long> counting = countStrig.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Counting of abcabcd = " +counting);


        // count vowel in string

        String vowel = "aeabcd";
        String vowelnumbers = "aeiou";
        long res = vowel.toLowerCase().chars().filter( c ->vowelnumbers.indexOf(c) >= 0).count();
        System.out.println(res);



// String [] input =  {"abc12" , "def45" , "pqr56st",  "sdd99ss"}

        // find the largest number







    }
}
