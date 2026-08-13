// Last updated: 13/08/2026, 22:39:18
1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int m = mat.length;
4        int n = mat[0].length;
5        k %= n;
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                if (mat[i][j] != mat[i][(j + k) % n]) {
9                    return false;
10                }
11            }
12        }
13        return true;
14    }
15}