// Last updated: 25/09/2026, 12:23:00
1class Solution {
2    public boolean judgeSquareSum(int c) {
3
4        long l = 0;
5        long r = (long) Math.sqrt(c);
6
7        while (l <= r) {
8            long sum = l * l + r * r;
9
10            if (sum == c)
11                return true;
12            else if (sum < c)
13                l++;
14            else
15                r--;
16        }
17
18        return false;
19    }
20}