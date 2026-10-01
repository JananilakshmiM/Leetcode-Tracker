// Last updated: 01/10/2026, 09:58:04
1class Solution {
2
3    int[] nums;
4    int[][] dp;
5
6    public int maxScore(int[] nums) {
7        this.nums = nums;
8
9        int m = nums.length;
10        dp = new int[1 << m][m / 2 + 1];
11
12        for (int i = 0; i < (1 << m); i++) {
13            for (int j = 0; j <= m / 2; j++) {
14                dp[i][j] = -1;
15            }
16        }
17
18        return solve(0, 1);
19    }
20
21    int solve(int mask, int operation) {
22
23        if (operation > nums.length / 2) {
24            return 0;
25        }
26
27        if (dp[mask][operation] != -1) {
28            return dp[mask][operation];
29        }
30
31        int ans = 0;
32
33        for (int i = 0; i < nums.length; i++) {
34
35            if ((mask & (1 << i)) != 0) {
36                continue;
37            }
38
39            for (int j = i + 1; j < nums.length; j++) {
40                if ((mask & (1 << j)) != 0) {
41                    continue;
42                }
43
44                int gcd = findGCD(nums[i], nums[j]);
45
46                int newMask = mask | (1 << i) | (1 << j);
47
48                int score = operation * gcd
49                          + solve(newMask, operation + 1);
50
51                ans = Math.max(ans, score);
52            }
53        }
54
55        return dp[mask][operation] = ans;
56    }
57
58    int findGCD(int a, int b) {
59
60        while (b != 0) {
61            int temp = a % b;
62            a = b;
63            b = temp;
64        }
65
66        return a;
67    }
68}