// Last updated: 31/07/2026, 13:47:48
1class Solution {
2    public int getLeastFrequentDigit(int n) {
3        int[] freq = new int[10];
4
5        int temp = n;
6        while (temp > 0) {
7            freq[temp % 10]++;
8            temp /= 10;
9        }
10
11        int res = -1;
12        int count = Integer.MAX_VALUE;
13
14        for (int d = 0; d <= 9; d++) {
15            if (freq[d] > 0) {
16                if (freq[d] < count) {
17                    count = freq[d];
18                    res = d;
19                } else if (freq[d] == count) {
20                    res = Math.min(res, d);
21                }
22            }
23        }
24
25        return res;
26    }
27}