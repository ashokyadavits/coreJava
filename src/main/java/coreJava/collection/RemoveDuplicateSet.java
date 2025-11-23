package coreJava.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateSet {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);

        // using set

        String input = "banana";

        Set<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) sb.append(c);

        System.out.println(sb.toString());  // ban
    }
}