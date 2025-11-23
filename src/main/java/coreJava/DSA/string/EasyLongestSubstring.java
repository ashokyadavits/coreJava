package coreJava.DSA.string;

import java.util.HashSet;

public class EasyLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        findLongestSubstring(s);
    }

    public static void findLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0, start = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (set.contains(ch)) {
                // remove leftmost char until duplicate is removed
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(ch);
                if (set.size() > maxLen) {
                    maxLen = set.size();
                    start = left; // store starting point of current longest substring
                }
                right++;
            }
        }

        // print result
        String longest = s.substring(start, start + maxLen);
        System.out.println("Longest Substring: " + longest);
        System.out.println("Length: " + maxLen);
    }
}