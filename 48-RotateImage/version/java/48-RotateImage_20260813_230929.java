// Last updated: 13/08/2026, 23:09:29
1class Solution {
2    public int getMoneyAmount(int n) {
3        int[][] dp = new int[n + 1][n + 1];
4
5        return calculateCost(1, n, dp);
6    }
7
8    private int calculateCost(int start, int end, int[][] dp) {
9        if (start >= end) return 0;
10
11        if (dp[start][end] != 0) return dp[start][end];
12
13        int minCost = Integer.MAX_VALUE;
14
15        for (int guess = (start + end) / 2; guess <= end; guess++) {
16            int cost = guess + Math.max(calculateCost(start, guess - 1, dp), calculateCost(guess + 1, end, dp));
17            minCost = Math.min(minCost, cost);
18        }
19
20        dp[start][end] = minCost;
21        return minCost;
22    }
23}