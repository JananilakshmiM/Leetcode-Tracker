// Last updated: 26/09/2026, 20:32:31
1class Solution {
2    Double[][] dp;
3    public double soupServings(int n) {
4        if (n >= 4800) {
5            return 1.0;
6        }
7        int N = (n + 24) / 25;
8
9        dp = new Double[N + 1][N + 1];
10
11        return solve(N, N);
12    }
13
14    private double solve(int a, int b) {
15        if (a <= 0 && b <= 0) {
16            return 0.5;
17        }
18
19        if (a <= 0) {
20            return 1.0;
21        }
22
23        if (b <= 0) {
24            return 0.0;
25        }
26
27        if (dp[a][b] != null) {
28            return dp[a][b];
29        }
30
31        double ans = 0;
32
33        ans += solve(a - 4, b);
34        ans += solve(a - 3, b - 1);
35        ans += solve(a - 2, b - 2);
36        ans += solve(a - 1, b - 3);
37
38        ans /= 4.0;
39
40        dp[a][b] = ans;
41
42        return ans;
43    }
44}