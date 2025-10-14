package java8;

import java.util.*;

public class StreamApi {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("abcd", "apple", "bcd");
        List<String> result = str.stream().filter( n ->n.startsWith("a")).toList();
        System.out.println(result);

        String s ="abcd";
        List<String> sList = Arrays.asList(s);
        List<String> res = sList.stream().map(String :: toUpperCase).toList();
        System.out.println(res);


        List<Integer> sal = Arrays.asList(100,222,344,3333);
       int sec = sal.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(sec);


        List<String> arrList = Arrays.asList("abcd", "cdbn");
        Long re = arrList.stream().count();
        System.out.println(re);

        // top 3 large number

        List<Integer> inte = Arrays.asList(12,23,34,35);
        List<Integer> resu = inte.stream().toList().stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(resu);

        List<Integer> a = Arrays.asList(1,2,3,2,2,1);
        List<Integer> ab = a.stream().distinct().filter( n -> Collections.frequency(a, n) >1).toList();
        System.out.println(ab);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ashok");
        map.put(2,"Aman");

        System.out.println(map.get(2));

        //

        String reves = "abcd";
        String reverse ="";
        for(int i = reves.length()-1; i>=0; i--) {

            reverse = reverse + reves.charAt(i);
            System.out.println(reverse);


        }



    }

}
