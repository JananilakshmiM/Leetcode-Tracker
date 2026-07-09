// Last updated: 09/07/2026, 15:10:41
class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        String temp = s + "#" + rev;

        int[] lps = new int[temp.length()];

        for (int i = 1; i < temp.length(); i++) {
            int len = lps[i - 1];

            while (len > 0 && temp.charAt(i) != temp.charAt(len)) {
                len = lps[len - 1];
            }

            if (temp.charAt(i) == temp.charAt(len)) {
                len++;
            }

            lps[i] = len;
        }

        int longestPrefix = lps[temp.length() - 1];

        String add =
            rev.substring(0, s.length() - longestPrefix);

        return add + s;
    }
}