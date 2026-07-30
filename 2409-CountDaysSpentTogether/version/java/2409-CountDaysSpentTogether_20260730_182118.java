// Last updated: 30/07/2026, 18:21:18
1class Solution {
2    public int countSymmetricIntegers(int low, int high) {
3         int ans = 0;
4    for (int i = low; i <= high; ++i) {
5        String s = Integer.toString(i);
6        int t = 0, n = s.length();
7        for (int j = 0; j < n / 2; ++j) { 
8            t += s.charAt(j) - s.charAt(n - j - 1);
9        }
10        if (n % 2 == 0 && t == 0)  ans++;
11    }
12    return ans;
13        
14    }
15}