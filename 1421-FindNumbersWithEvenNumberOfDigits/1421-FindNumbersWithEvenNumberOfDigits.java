// Last updated: 09/07/2026, 15:08:05
class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(String.valueOf(nums[i]).length()  % 2 == 0) {
                count++;
            }
        }
        return count;
        
    }
}