package coreJava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayLIstConversion {


    public static void main(String[] args) {
        List<String > list = Arrays.asList("aman", "raj", "ramam");

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(n ->n.length(), n -> n));
        System.out.println(map);



    }
}
