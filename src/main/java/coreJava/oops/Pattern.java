package coreJava.oops;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int i = sc.nextInt();
        System.out.println("enter colums");

        int j = sc.nextInt();


        for (i = 1; i <= 10; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (i = 1; i <= 10; i++) {

            for (j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}