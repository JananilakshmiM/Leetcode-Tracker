// Last updated: 09/07/2026, 18:52:21
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int minRow = m;
4        int minCol = n;
5
6        for (int[] op : ops) {
7            minRow = Math.min(minRow, op[0]);
8            minCol = Math.min(minCol, op[1]);
9        }
10
11        return minRow * minCol;
12    }
13}