package coreJava.java8.Char;

import java.util.HashSet;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String str = "ababcaaa";

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        String longest = "";

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);

            // If char is already in the window, shrink the window
            while (set.contains(c)) {
                set.remove(str.charAt(left));
                left++;
            }

            // Add new char to window
            set.add(c);

            // Check for max
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longest = str.substring(left, right + 1);
            }
        }

        System.out.println("Longest non-repeating substring: " + longest);
        System.out.println("Length: " + maxLength);
    }
}