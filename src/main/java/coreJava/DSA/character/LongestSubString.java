package coreJava.DSA.character;

import java.util.Arrays;

public class LongestSubString {
    public static void main(String[] args) {

        String s = "abcdabcd";
        int left = 0, maxLen = 0, start = 0;
        int[] freq = new int[256];

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c]++;

            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }
        System.out.println(start +maxLen);

    }
}