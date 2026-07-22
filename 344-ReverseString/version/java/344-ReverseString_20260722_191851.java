// Last updated: 22/07/2026, 19:18:51
1class Solution {
2    public void reverseString(char[] s) {
3        int left = 0, right = s.length - 1;
4        while(left < right)
5        {
6            char temp = s[left];
7            s[left] = s[right];
8            s[right] = temp;
9            left ++;
10            right --;
11        }
12    }
13}