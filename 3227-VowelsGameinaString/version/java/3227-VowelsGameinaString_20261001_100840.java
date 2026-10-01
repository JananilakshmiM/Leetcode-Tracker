// Last updated: 01/10/2026, 10:08:40
1class Solution {
2    public boolean doesAliceWin(String s) {
3        for (int i = 0; i < s.length(); i++)
4            if ((0x104111 >> (s.charAt(i) - 97) & 1) != 0)
5                return true;
6        return false;
7    }
8}