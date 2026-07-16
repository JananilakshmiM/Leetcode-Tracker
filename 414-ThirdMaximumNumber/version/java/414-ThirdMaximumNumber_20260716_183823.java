// Last updated: 16/07/2026, 18:38:23
1class Solution {
2        public int thirdMax(int[] nums) {
3        Integer max1 = null;
4        Integer max2 = null;
5        Integer max3 = null;
6        for (Integer n : nums) {
7            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
8            if (max1 == null || n > max1) {
9                max3 = max2;
10                max2 = max1;
11                max1 = n;
12            } else if (max2 == null || n > max2) {
13                max3 = max2;
14                max2 = n;
15            } else if (max3 == null || n > max3) {
16                max3 = n;
17            }
18        }
19        return max3 == null ? max1 : max3;
20    }
21}