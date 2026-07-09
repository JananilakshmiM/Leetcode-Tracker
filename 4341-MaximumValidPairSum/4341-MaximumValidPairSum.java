// Last updated: 09/07/2026, 15:05:35
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int maxLeft=nums[0];
        int maxSum=Integer.MIN_VALUE;
        for(int j=k; j<n; j++){
            maxLeft=Math.max(maxLeft,nums[j-k]);
            maxSum=Math.max(maxSum,maxLeft+nums[j]);
                
            }
        return maxSum;
        
    }
}