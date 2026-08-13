// Last updated: 13/08/2026, 22:32:39
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        return helper(nums, 0, 0); 
4    }
5    public int helper(int nums[], int level, int currentXOR){
6        if(level == nums.length) return currentXOR;
7        int include = helper(nums, level + 1, currentXOR^nums[level]);
8        int exclude = helper(nums, level + 1, currentXOR);
9        
10        return include + exclude;
11    }
12}