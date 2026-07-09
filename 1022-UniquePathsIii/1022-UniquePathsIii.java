// Last updated: 09/07/2026, 15:08:52
class Solution {

    private int rows, cols;
    private int totalToVisit;
    private int result = 0;

    public int uniquePathsIII(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int startR = 0, startC = 0;
        totalToVisit = 0;

        // find start + count usable cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != -1) {
                    totalToVisit++;
                }
                if (grid[i][j] == 1) {
                    startR = i;
                    startC = j;
                }
            }
        }

        dfs(grid, startR, startC, 1);
        return result;
    }

    private void dfs(int[][] grid, int r, int c, int visitedCount) {

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == -1) {
            return;
        }

        if (grid[r][c] == 2) {
            if (visitedCount == totalToVisit) {
                result++;
            }
            return;
        }

        // mark visited
        int temp = grid[r][c];
        grid[r][c] = -1;

        dfs(grid, r + 1, c, visitedCount + 1);
        dfs(grid, r - 1, c, visitedCount + 1);
        dfs(grid, r, c + 1, visitedCount + 1);
        dfs(grid, r, c - 1, visitedCount + 1);

        grid[r][c] = temp;
    }
}