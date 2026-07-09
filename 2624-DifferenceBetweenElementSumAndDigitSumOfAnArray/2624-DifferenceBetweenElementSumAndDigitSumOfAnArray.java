// Last updated: 09/07/2026, 15:06:43
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0, dsum = 0;
        for(int x:nums) {
            esum += x;
            while(x!=0) {
                dsum += x % 10;
                x/=10;
        }
            
        }
        return Math.abs(esum - dsum);

    }
}