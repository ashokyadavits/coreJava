package coreJava.java8;

import java.util.*;

public class IntermidateOperations {

    // filter, map, sort
    // list - unordwered
    // set - ordered , unique
    // tree set sorted
    // map - key, value


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "abcd");
        map.put(2, "cdbc");

        System.out.println(map.get(1));

        // unique, unorsdered
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);


        // sorted
        TreeSet<Integer> tr = new TreeSet<>();
        tr.add(2);
        tr.add(3);
        tr.add(1);
        System.out.println(tr);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println(list);

    }





}