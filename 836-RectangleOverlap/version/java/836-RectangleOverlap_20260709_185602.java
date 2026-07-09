// Last updated: 09/07/2026, 18:56:02
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        return rec1[0] < rec2[2] &&
4               rec1[2] > rec2[0] &&
5               rec1[1] < rec2[3] &&
6               rec1[3] > rec2[1];
7    }
8}