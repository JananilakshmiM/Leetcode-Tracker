// Last updated: 03/10/2026, 19:45:37
1class Solution {
2    public int maxAbsValExpr(int[] arr1, int[] arr2) {
3        int n = arr1.length;
4        int res = 0;
5
6        int[][] sign = {
7                { 1, 1 },
8                { -1, 1 },
9                { 1, -1 },
10                { -1, -1 }
11        };
12
13        for (int[] s : sign) {
14            int max = Integer.MIN_VALUE;
15            int min = Integer.MAX_VALUE;
16
17            for (int i = 0; i < n; i++) {
18                int val = s[0] * arr1[i] + s[1] * arr2[i] + i;
19
20                if (val > max)
21                    max = val;
22                if (val < min)
23                    min = val;
24            }
25
26            res = Math.max(res, max - min);
27        }
28
29        return res;
30    }
31}