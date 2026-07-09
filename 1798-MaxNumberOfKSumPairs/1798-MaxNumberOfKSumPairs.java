// Last updated: 09/07/2026, 15:07:46
class Solution {
    public int maxOperations(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            sum=nums[i]+nums[j];
            if(sum==k){
                count++;
                i++;
                j--;
        }
        else if(sum>k){
            j--;
        }
        else{
            i++;
        }
        }
        return count;
    }
}