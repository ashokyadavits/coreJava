package coreJava.DSA.character;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringSet {

    public static void main(String[] args) {
        String s = "aabbcccabcdd";
        System.out.println("Longest substring = " + longestSubstring(s));
    }

    public static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If duplicate → remove from left until unique
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);  // add current character

            // Track longest window
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }
}