// Last updated: 25/07/2026, 15:06:48
1class Solution {
2    public int surfaceArea(int[][] grid) {
3        int sum = 0;
4        for (int i = 0; i < grid.length; i++) {
5            for (int j = 0; j < grid[0].length; j++) {
6                int h = grid[i][j];
7                int fullS = h > 0 ? h * 4 + 2 : 0;
8                if (cellExists(i, j - 1, grid)) {
9                    if (h <= grid[i][j - 1]) {
10                        fullS -= h;
11                    } else {
12                        fullS -= grid[i][j - 1];
13                    }
14                }
15                if (cellExists(i - 1, j, grid)) {
16                    if (h <= grid[i - 1][j]) {
17                        fullS -= h;
18                    } else {
19                        fullS -= grid[i - 1][j];
20                    }
21                }
22                if (cellExists(i, j + 1, grid)) {
23                    if (h <= grid[i][j + 1]) {
24                        fullS -= h;
25                    } else {
26                        fullS -= grid[i][j + 1];
27                    }
28                }
29                if (cellExists(i + 1, j, grid)) {
30                    if (h <= grid[i + 1][j]) {
31                        fullS -= h;
32                    } else {
33                        fullS -= grid[i + 1][j];
34                    }
35                }
36                sum += fullS;
37            }
38        }
39        return sum;
40    }
41
42    private static boolean cellExists(int row, int col, int[][] array) {
43        return (row <= array.length - 1 && row >= 0) && (col <= array[0].length - 1 && col >= 0);
44    }
45}