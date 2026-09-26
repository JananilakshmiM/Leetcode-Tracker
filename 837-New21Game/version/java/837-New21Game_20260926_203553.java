// Last updated: 26/09/2026, 20:35:53
1class Solution {
2    public double new21Game(int n, int k, int maxPts) {
3        if (k == 0) {
4            return 1.0;
5        }
6        if (n >= k - 1 + maxPts) {
7            return 1.0;
8        }
9
10        double[] dp = new double[n + 1];
11
12        dp[0] = 1.0;
13
14        double windowSum = 1.0;
15        double answer = 0.0;
16
17        for (int i = 1; i <= n; i++) {
18
19            dp[i] = windowSum / maxPts;
20            if (i < k) {
21                windowSum += dp[i];
22            } else {
23                answer += dp[i];
24            }
25            if (i - maxPts >= 0) {
26                windowSum -= dp[i - maxPts];
27            }
28        }
29
30        return answer;
31    }
32}
33        