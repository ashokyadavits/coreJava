package coreJava.string;

public class LongestSubString {

    public static void main(String[] args) {
        String s = "aaaaabbbbbbccc";
        System.out.println(longestRepeated(s));
    }

    public static String longestRepeated(String s) {
        int maxLen = 1, currLen = 1;
        char maxChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLen++;
            } else {
                currLen = 1;
            }

            if (currLen > maxLen) {
                maxLen = currLen;
                maxChar = s.charAt(i);
            }
        }

        // build the substring
        return String.valueOf(maxChar).repeat(maxLen);
    }
}