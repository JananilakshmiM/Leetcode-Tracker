// Last updated: 09/07/2026, 15:06:02
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long x0=nums[0];
        long xMult = (long) nums[0]*k;
        long xDiv=div(nums[0],k);
        long dp0=x0;
        long dp1M=xMult;
        long dp1D=xDiv;
        long dp2=Long.MIN_VALUE/2;
        long maxResult=Math.max(Math.max(dp0,dp1M), dp1D);
        for(int i=1; i<n; i++){
            long x=nums[i];
            long multX=x*k;
            long divX=div(x,k);
            long next_dp0=Math.max(x,dp0+x);
            long next_dp1M=Math.max(multX,Math.max(dp0+multX, dp1M+multX));
            long next_dp1D=Math.max(divX,Math.max(dp0+divX,dp1D+divX));
            long next_dp2=Math.max(dp2+x,Math.max(dp1M+x, dp1D+x));
            dp0=next_dp0;
            dp1M=next_dp1M;
            dp1D=next_dp1D;
            dp2=next_dp2;
            long currentMax=Math.max(Math.max(dp0,dp1M), Math.max(dp1D,dp2));
            maxResult=Math.max(maxResult,currentMax);
        }
        return maxResult;
    }
        private long div(long num,int k){
            return num/k;
        
    }
}