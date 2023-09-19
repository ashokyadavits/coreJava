package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {

    public static void main(String[] args) {

        // first method to create list
        List<Integer> list1 = Arrays.asList(12, 23, 24, 34,12);

        // second
        //without stream api
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(12);

        List<Integer> evenList = new ArrayList<>();
        for (Integer e : list) {
            if (e % 2 == 0) {
                evenList.add(e);
            }
        }
        System.out.println(list);
        System.out.println(evenList);

        // with stream api -- Stream & filters with lambda
       // Stream<Integer> stream = list.stream();
       // Stream<Integer> stream1 = list.stream();
        List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> newList2 = list1.stream().filter(i -> i>13).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println(newList2);

        // frequency of every element
       Map<String,Long> freList = list1.stream().map(x->x.toString()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freList);

        Stream<Integer> stream = list.stream();
        stream.forEach(e ->{
           System.out.println("Print " + e);
        });
    }

}
