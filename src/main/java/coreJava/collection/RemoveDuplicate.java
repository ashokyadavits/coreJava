package coreJava.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 2, 4, 1};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        Integer[] result = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(result));

        // using java8

        Integer[] result1 = Arrays.stream(arr)
                .distinct()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(result1));
    }


}