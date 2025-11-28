package coreJava.basicPrograms;

public class PrimeNumberExample {
    public static void main(String[] args) {
        // another way to do
        // another way

        for (int n = 2; n <= 50; n++) {   // start from 2
            boolean isPrime = true;

            for (int i = 2; i < n; i++) { // check divisors
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }}