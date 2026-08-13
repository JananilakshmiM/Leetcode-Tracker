// Last updated: 13/08/2026, 22:43:01
1class Solution {
2    public int[] getFinalState(int[] nums, int k, int multiplier) {
3
4        while (k-- > 0) {
5
6            int minIdx = 0;
7
8            for (int i = 1; i < nums.length; i++) {
9                if (nums[minIdx] > nums[i]) {
10                    minIdx = i;
11                }
12            }
13
14            nums[minIdx] *= multiplier;
15        }
16
17        return nums;
18    }
19}