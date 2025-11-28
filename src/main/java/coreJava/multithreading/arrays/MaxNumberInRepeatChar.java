package coreJava.multithreading.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNumberInRepeatChar {

    public static void main(String[] args) {

        Integer[] array = {2, 2, 3, 6, 9, 5, 9, 11};

        List<Integer> list = Arrays.asList(array);
        List<Integer> result = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toList());

        Optional<Integer> resultLargest = result.stream().distinct().sorted(Collections.reverseOrder()).findFirst();
        System.out.println(result);
        System.out.println(resultLargest);


    }
}