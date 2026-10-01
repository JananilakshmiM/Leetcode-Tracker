// Last updated: 01/10/2026, 10:18:16
1class Solution {
2    private static final long mod = 1000000007;
3    private static long[][] s = new long[1001][1001];
4    static {
5        s[0][0] = 1;
6        for (int i = 1; i <= 1000; i++)
7            for (int j = 1; j <= i; j++)
8                s[i][j] = (s[i - 1][j - 1] + s[i - 1][j] * j) % mod;
9    }
10
11    public int numberOfWays(int n, int x, int y) {
12        long res = 0, perm = 1, pow = 1;
13        for (int i = 1; i <= Math.min(n, x); i++) {
14            perm = perm * (x - i + 1) % mod;
15            pow = pow * y % mod;
16            res = (res + perm * s[n][i] % mod * pow) % mod;
17        }
18        return (int) res;
19    }
20}