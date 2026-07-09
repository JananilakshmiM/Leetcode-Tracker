// Last updated: 09/07/2026, 15:06:11
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigit = 0;
        int doubledigit = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 10) {
                singledigit = singledigit + nums[i];
            }
            else {
                doubledigit = doubledigit + nums[i];
            }
           
        }
         if(singledigit != doubledigit) {
                return true;
            }
            else {
                return false;
            }
}
        
}