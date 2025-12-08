package coreJava.java8.string;

import java.util.*;

public class MissingElement {
    public static void main(String[] args) {

        List<Integer> arList = Arrays.asList(1,3,5,7,9);
        int min = 1;
        int max = 9;
        Set<Integer> set = new HashSet<>(arList);
        List<Integer> missing = new ArrayList<>();

        for(int i = min; i <=max; i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
        System.out.println(missing);
    }
}