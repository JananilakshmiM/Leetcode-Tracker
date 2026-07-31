// Last updated: 31/07/2026, 13:50:58
1class Solution {
2    public String smallestGoodBase(String n) {
3        long tn = Long.parseLong(n);
4        long x = 1;
5        
6        for (int i = 62; i >= 1; i--) {
7            if ((x << i) < tn) {
8                long cur = mySolve(tn, i);
9                if (cur != 0) {
10                    return Long.toString(cur);
11                }
12            }
13        }
14        
15        return Long.toString(tn - 1);
16    }
17    private long mySolve(long n, int d) {
18        double tn = (double) n;
19        long right = (long) (Math.pow(tn, 1.0 / d) + 1);
20        long left = 1;
21        
22        while (left <= right) {
23            long mid = left + (right - left) / 2;
24            long sum = 1, cur = 1;
25            
26            for (int i = 1; i <= d; i++) {
27                cur *= mid;
28                sum += cur;
29            }
30            
31            if (sum == n) {
32                return mid;
33            }
34            
35            if (sum > n) {
36                right = mid - 1;
37            } else {
38                left = mid + 1;
39            }
40        }
41        
42        return 0;
43    }
44}