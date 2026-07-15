// Last updated: 15/07/2026, 21:43:00
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        boolean[] flag = new boolean[1001];
4
5        for (int num : nums1) {
6            flag[num] = true;
7        }
8
9        int[] result = new int[Math.min(nums1.length, nums2.length)];
10        int index = 0;
11
12        for (int num : nums2) {
13            if (flag[num]) {
14                result[index++] = num;
15                flag[num] = false;
16            }
17        }
18
19        return Arrays.copyOf(result, index);
20    }
21}