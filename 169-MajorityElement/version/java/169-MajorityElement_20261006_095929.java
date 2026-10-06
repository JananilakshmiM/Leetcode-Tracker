// Last updated: 06/10/2026, 09:59:29
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        return nums[n/2];
6    }
7}