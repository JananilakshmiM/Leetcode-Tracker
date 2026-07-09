// Last updated: 09/07/2026, 15:10:23
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i <= nums.length; i++) {
            xor = xor ^ i;

        }
        for(int x:nums) {
            xor = xor ^ x;
        }
        return xor;
        
    }
}