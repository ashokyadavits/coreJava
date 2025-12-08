package coreJava.java8.string;

import java.util.*;
import java.util.stream.Collectors;

public class CharShifting {
    public static void main(String[] args) {
        String str = "abcd";
        char[] ch = str.toCharArray();
        char start = ch[0];
        for (int i = 0; i < ch.length - 1; i++) {
            ch[i] = ch[i + 1];
        }
        ch[ch.length - 1] = start;
        System.out.println(Arrays.toString(ch));

        // squareroot of arrays

        int[] arr = {8, 27, 64};

        double[] result = Arrays.stream(arr).mapToDouble(Math::sqrt).toArray();
        System.out.println(Arrays.toString(result));

        // addition of square root

        double reultAdd = Arrays.stream(arr).mapToDouble(Math::sqrt).sum();
        System.out.println(reultAdd);

        // char count and order by desc
        String str1 = "abcdabcdaebbddddd";

        List<String> list = Arrays.asList(str1.split(""));
        Map<String, Long> list1 = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        Map<String, Long> listResult = list1.entrySet().stream().
          sorted(Map.Entry.<String, Long>comparingByValue().reversed())
         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(listResult);

    }
}