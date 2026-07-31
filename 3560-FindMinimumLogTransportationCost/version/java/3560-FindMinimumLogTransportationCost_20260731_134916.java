// Last updated: 31/07/2026, 13:49:16
1class Solution {
2    public int minMoves(int[] nums) {
3        int max = nums[0], ans = 0;
4        for(int i = 1; i < nums.length; i++) max = Math.max(max, nums[i]);
5        for(int i = 0; i < nums.length; i++) ans += max - nums[i];
6        return ans;
7    }
8}