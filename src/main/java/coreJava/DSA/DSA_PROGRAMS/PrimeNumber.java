package coreJava.DSA.DSA_PROGRAMS;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //  2, 3, 5, 7, 11, 13, 17, 19, 23, 29

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(isPrime(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }

    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;     // 0,1 are not prime
        if(n == 2) return true;      // 2 is prime
        if(n % 2 == 0) return false; // even numbers > 2 are not prime

        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }


}