package coreJava.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {


        String str = "welcome to java";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one character");
        String input = sc.next();

        List<String> list = Arrays.asList(str);
        long count = list.stream().filter(n -> n.equals(sc)).collect(Collectors.counting());

        System.out.println(count);

    }
}