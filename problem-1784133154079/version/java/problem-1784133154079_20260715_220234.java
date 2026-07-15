// Last updated: 15/07/2026, 22:02:34
1class Solution {
2    public int arrayPairSum(int[] nums) {
3
4        Arrays.sort(nums);
5
6        int sum = 0;
7
8        for (int i = 0; i < nums.length; i += 2) {
9            sum += nums[i];
10        }
11
12        return sum;
13    }
14}