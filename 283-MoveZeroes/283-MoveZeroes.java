// Last updated: 09/07/2026, 15:10:21
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(nums[i] != 0) {
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}