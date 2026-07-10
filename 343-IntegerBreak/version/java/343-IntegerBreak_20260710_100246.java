// Last updated: 10/07/2026, 10:02:46
1class Solution {
2    public int integerBreak(int n) {
3         if (n <= 1) {
4            return 0;
5        }
6        int[] dp = new int[n + 1];
7        dp[1] = 1;
8        for (int i = 2; i <= n; i++) {
9            for (int j = 1; j < i; j++) {
10                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
11            }
12        }
13        return dp[n];
14    }
15}