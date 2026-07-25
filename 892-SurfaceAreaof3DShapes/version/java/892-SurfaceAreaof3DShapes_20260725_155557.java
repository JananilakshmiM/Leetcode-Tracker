// Last updated: 25/07/2026, 15:55:57
1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3        if (!(str1 + str2).equals(str2 + str1)) {
4            return "";
5        }
6
7        int a = str1.length();
8        int b = str2.length();
9
10        while (b != 0) {
11            int temp = b;
12            b = a % b;
13            a = temp;
14        }
15
16        return str2.substring(0, a);
17    }
18}