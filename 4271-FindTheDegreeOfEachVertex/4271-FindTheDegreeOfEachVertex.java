// Last updated: 09/07/2026, 15:05:41
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int degree = 0;

            for (int j = 0; j < n; j++) {
                degree += matrix[i][j];
            }

            ans[i] = degree;
        }

        return ans;
    }
}