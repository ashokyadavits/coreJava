package coreJava.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPiPrograms {

    public static void main(String[] args) {

        // find dublicate elements
        List<Integer> list = Arrays.asList(1,1,2,3,4,4,5);

        List<Integer> result = list.stream().filter(n -> Collections.frequency(list , n)>1).toList();
        System.out.println(result);

        // remove dublicate

        List<Integer> result1 = list.stream().distinct().toList();
        System.out.println(result1);

        // count the elements

        Long result2 = list.stream().collect(Collectors.counting());
        System.out.println(result2);

        // second highest number

        int result4 = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(result4);

        // sort in assending order

        List<Integer> result5 = list.stream().sorted().toList();
        System.out.println(result5);

        // decending order

        List<Integer> result6 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result6);

        // count the dublict element


    }
}