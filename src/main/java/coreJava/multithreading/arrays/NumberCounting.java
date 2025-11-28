package coreJava.multithreading.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Demo1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,2,3,4,4,1);
        Map<Integer, Long > result = list.stream().filter(n -> Collections.frequency(list , n) >1 ).collect(Collectors.groupingBy(n ->n, Collectors.counting()));
        System.out.println(result);

    }

    public void m1(){
        System.out.println("print m1");
    }

    public void m2(String str){
        System.out.println(str);

    }
}

class Demo3 {

   public void m1(){
       System.out.println("Demo2 of M1");
       //super.m1();
   }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.m2("print");
        demo1.m1();
    }

}