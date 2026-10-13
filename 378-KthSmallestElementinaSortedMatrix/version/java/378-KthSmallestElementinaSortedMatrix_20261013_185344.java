// Last updated: 13/10/2026, 18:53:44
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int m = matrix.length, n = matrix[0].length;
4        int low = matrix[0][0], high = matrix[m - 1][n - 1];
5        while (low < high) {
6            int mid = (high - low) / 2 + low;
7            int count = 0; 
8            int j = n - 1;
9            for (int i = 0; i < m; i++) {
10                while (j >= 0 && matrix[i][j] > mid)
11                    j--;
12                count += j + 1;
13            }
14            if (count < k)
15                low = mid + 1;
16            else
17                high = mid;
18        }
19        return low;
20    }
21}