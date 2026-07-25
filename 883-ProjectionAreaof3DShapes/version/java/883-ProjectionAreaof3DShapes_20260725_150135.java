// Last updated: 25/07/2026, 15:01:35
1class Solution {
2    public int projectionArea(int[][] grid) {
3        int xy = 0, row[] = new int[grid.length], col[] = new int[grid[0].length];
4        for (int i = 0; i < grid.length; i++)
5            for (int j = 0; j < grid[0].length; j++) {
6                if (grid[i][j] != 0)
7                    xy++;
8                if (grid[i][j] > row[i])
9                    row[i] = grid[i][j];
10                if (grid[i][j] > col[j])
11                    col[j] = grid[i][j];
12            }
13        int total = xy;
14        for (int i : row)
15            total += i;
16        for (int i : col)
17            total += i;
18        return total;
19    }
20}