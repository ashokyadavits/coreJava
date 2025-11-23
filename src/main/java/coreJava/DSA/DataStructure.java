package coreJava.DSA;

import java.util.Arrays;
import java.util.List;

public class DataStructure {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5);
        List<Integer> result = number.stream().filter(n -> n >3 ).toList();
        System.out.println(result);



    }

}