// Last updated: 13/08/2026, 22:40:37
1class Solution {
2    public String triangleType(int[] nums) {
3        if(nums[0]+nums[1]<=nums[2] || nums[0]+nums[2]<=nums[1] || nums[1]+nums[2]<=nums[0])
4            return "none";
5        if(nums[0]==nums[1] && nums[1]==nums[2])return "equilateral";
6        else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2])return "isosceles";
7        else return "scalene";
8    }
9}