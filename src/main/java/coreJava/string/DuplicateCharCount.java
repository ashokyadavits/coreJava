package coreJava.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateCharCount {

    public static void main(String[] args) {
        String str = "abcabc";
        List<String> list = Arrays.asList(str.split(""));

        String result = list.stream().distinct().filter(n -> Collections.frequency(list, n) > 1).skip(1).findFirst().get();
        System.out.println(result);

        // duplicate char

        List<String> result1 = list.stream().distinct().filter(n -> Collections.frequency(list, n) > 1).toList();
        System.out.println(result1);

    }

}