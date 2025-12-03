package coreJava.java8.Char;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello Java";
        Map<Boolean, Long> result = str.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(Character::isLetter).collect(Collectors.partitioningBy(c -> "aeiou".indexOf(c) != -1,
                        Collectors.counting()));
        System.out.println("Vowels: " + result.get(true) + ", Consonants: " + result.get(false));
    }
}