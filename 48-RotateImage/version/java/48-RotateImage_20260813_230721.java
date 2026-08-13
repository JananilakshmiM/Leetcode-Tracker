// Last updated: 13/08/2026, 23:07:21
1class Solution {
2    public int numSquares(int n) {
3        int dp[][] = new int[n+1][(int)Math.sqrt(n)+1];
4        for(int i[] : dp){
5            Arrays.fill(i, -1);
6        }
7        return helper(n, dp, 1);
8    }
9
10    public int helper(int n, int dp[][], int i){
11        if(n==0){
12            return 0;
13        }
14        if(n<0 || i*i>n){
15            return Integer.MAX_VALUE/2;
16        }
17        if(dp[n][i]!=-1){
18            return dp[n][i];
19        }
20        int opt1 = 1+helper(n-(i*i), dp, i);
21        int opt2 = helper(n, dp, i+1);
22
23        return dp[n][i]=Math.min(opt1, opt2);
24    }
25}