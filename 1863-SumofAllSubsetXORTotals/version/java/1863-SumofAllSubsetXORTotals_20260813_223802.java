// Last updated: 13/08/2026, 22:38:02
1class Solution {
2    public int distributeCandies(int n, int limit) {
3        if (limit * 3 < n) {
4            return 0;
5        }
6        int res = 0;
7        for (int i = Math.min(limit, n); i >= 0; i--) {
8            int n2 = n - i;
9            if (n2 > limit * 2) continue;
10            int j = Math.min(limit, n2); 
11            int k = Math.max(0, n2 - j);
12            res += j - k + 1;
13        }
14        return res;
15    }
16}