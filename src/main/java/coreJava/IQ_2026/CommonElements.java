package coreJava.IQ_2026;

import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("dep1", "dept2", "dept3");
        List<String> list2 = Arrays.asList("dep1", "dept2");

        // can apply method ref or lambda in filter
        List<String> commonElements = list1.stream().filter(list2 :: contains).toList();
        System.out.println(commonElements);

    }
}