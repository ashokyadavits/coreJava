package coreJava.DSA.character;

import java.util.HashMap;

public class LongestSubString1 {

    public static void main(String[] args) {
        String s = "aabbcccabcdd";
        System.out.println("Longest substring = " + longestSubstring(s));
    }

    public static String longestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If char seen and inside current window, move left
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right);  // update last seen index

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }
}