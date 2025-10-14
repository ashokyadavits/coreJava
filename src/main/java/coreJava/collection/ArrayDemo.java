package coreJava.collection;
import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,1,2,4);
        List<Integer>  res = list.stream().filter( n -> n%2 == 0).toList();
        System.out.println(res);

        int [] intLIst = new int[10];
        intLIst[0] = 10;

        int[] intl = {1,2,3,4,5};

        Optional<Integer> resu = list.stream().filter(n -> Collections.frequency(list, n) >1).distinct().max(Comparator.reverseOrder());

        System.out.println(resu);



    }
}
