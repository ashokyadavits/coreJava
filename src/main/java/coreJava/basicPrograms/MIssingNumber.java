package coreJava.basicPrograms;

import java.util.*;

public class MIssingNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9);
        List<Integer> missing = new ArrayList<>();
        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(list.size() - 1);

        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                missing.add(i);
            }
        }
        System.out.println(missing);
    }
}