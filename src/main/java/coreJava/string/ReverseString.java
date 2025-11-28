package coreJava.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ReverseStringProgram {
    public static void main(String[] args) {
        String fname = "Ashok";
        String lname = "yadav";

        List<String> list = Arrays.asList(fname, lname);
        Collections.reverse(list);
        System.out.println("fanem: " + list.get(0));
        System.out.println("lname: " +list.get(1));

        List<String> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);

        String str = fname + lname;

        String temp = fname;
        fname = lname;
        lname = fname;
        System.out.println(fname);

         int a = 10;
         int b = 20;

         a = a + b;
         b = a - b;
         a = a- b;
        System.out.println(" A is : "+ a +" B is : " + b);

    }
}