package coreJava.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArray {

    public static void main(String[] args) {

        List<Integer>  input = Arrays.asList(1,2,3,4,2,1,3);
        List<Integer> result = input.stream().distinct().toList();
        System.out.println(result);

        List<Integer> result1 = input.stream().filter( n -> n% 2 == 0 ).map( n -> n*n).sorted(Collections.reverseOrder()).toList();
        System.out.println(result1);

        List<String> listStr = Arrays.asList("abcd", "bcd", "bcd");

        String output = listStr.stream().collect(Collectors.joining(", "));
        System.out.println(output);




    }
}
