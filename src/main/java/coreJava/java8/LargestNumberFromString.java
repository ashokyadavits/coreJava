package coreJava.java8;

import java.util.Arrays;

public class LargestNumberFromString {

        public static void main(String[] args) {
            String[] str = {"abcd123", "cdab12", "gsh535"};

            int max = Arrays.stream(str)
                    .map(s -> s.replaceAll("\\D+", ""))  // Remove all non-digit characters
                    .filter(s -> !s.isEmpty())           // Remove empty results
                    .mapToInt(Integer::parseInt)         // Convert to int
                    .max()                               // Get max
                    .orElse(0);                          // Default if no number found

            System.out.println("Largest number: " + max);
        }
    }