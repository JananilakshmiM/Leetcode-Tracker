// Last updated: 11/07/2026, 20:26:49
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2,
3                           int bx1, int by1, int bx2, int by2) {
4
5        int area1 = (ax2 - ax1) * (ay2 - ay1);
6
7        int area2 = (bx2 - bx1) * (by2 - by1);
8
9        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
10
11        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
12
13        int overlapArea = 0;
14        if (overlapWidth > 0 && overlapHeight > 0) {
15            overlapArea = overlapWidth * overlapHeight;
16        }
17
18        return area1 + area2 - overlapArea;
19    }
20}