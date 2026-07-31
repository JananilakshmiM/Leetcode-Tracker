// Last updated: 31/07/2026, 13:45:13
1class Solution {
2    public long minCuttingCost(int n, int m, int k) {
3        if(n <= k && m <= k){
4            return 0;
5        }
6        long ans = 0;
7        if(n > k && m<=k){
8            ans += (long)(n - k) * k;
9        }
10        if(m > k && n<=k){
11            ans += (long)(m - k) * k;
12        }
13        return ans;
14    }
15}