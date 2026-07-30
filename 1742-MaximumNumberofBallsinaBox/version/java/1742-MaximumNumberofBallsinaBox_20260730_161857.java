// Last updated: 30/07/2026, 16:18:57
1class Solution {
2    public int divisorSubstrings(int num, int k) {
3
4        String s = String.valueOf(num);
5        int count = 0;
6
7        for (int i = 0; i <= s.length() - k; i++) {
8
9            String sub = s.substring(i, i + k);
10            int n1 = Integer.parseInt(sub);
11
12            if (n1 != 0 && num % n1 == 0) {
13                count++;
14            }
15        }
16
17        return count;
18    }
19}