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

        int [] ar = {10,20,30,40};
        int [] arr = new int[5];
        arr [0] = 10;
        arr[1] = 20;

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(arr));

    }
}