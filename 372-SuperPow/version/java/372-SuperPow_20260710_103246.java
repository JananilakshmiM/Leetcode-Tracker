// Last updated: 10/07/2026, 10:32:46
1class Solution {
2    private static final int MOD = 1337;
3
4    private int pow(int a, int b) {
5        int result = 1;
6        a %= MOD;
7        for (int i = 0; i < b; i++) {
8            result = (result * a) % MOD;
9        }
10        return result;
11    }
12
13    public int superPow(int a, int[] b) {
14        int result = 1;
15        for (int i = b.length - 1; i >= 0; i--) {
16            result = (result * pow(a, b[i])) % MOD;
17            a = pow(a, 10);
18        }
19        return result;
20    }
21}