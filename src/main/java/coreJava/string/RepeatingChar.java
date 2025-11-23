package coreJava.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

 class Demo10 {

    public static void main(String[] args) {
        String str = "abcabc";
        List<String> list = Arrays.asList(str.split(""));

        String result = list.stream().distinct().filter(n -> Collections.frequency(list, n) > 1).skip(1).findFirst().get();

        System.out.println(result);
    }

}