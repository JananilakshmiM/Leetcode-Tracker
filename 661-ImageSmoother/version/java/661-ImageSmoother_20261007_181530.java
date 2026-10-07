// Last updated: 07/10/2026, 18:15:30
1class Solution {
2    public int[][] imageSmoother(int[][] img) {
3        int rows = img.length;
4        int cols = img[0].length;
5        int[][] result = new int[rows][cols];
6
7        for (int i = 0; i < rows; ++i) {
8            for (int j = 0; j < cols; ++j) {
9                int total_sum = 0;
10                int count = 0;
11
12                for (int l = Math.max(0, i-1); l < Math.min(rows, i+2); ++l) {
13                    for (int k = Math.max(0, j-1); k < Math.min(cols, j+2); ++k) {
14                        total_sum += img[l][k];
15                        count += 1;
16                    }
17                }
18
19                result[i][j] = total_sum / count;
20            }
21        }
22
23        return result;
24    }
25}