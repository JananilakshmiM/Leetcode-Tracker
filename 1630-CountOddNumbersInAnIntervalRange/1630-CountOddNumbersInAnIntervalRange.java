// Last updated: 09/07/2026, 15:07:53
class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 == 0) {
         low++;
        }
        if(low > high) {
            return 0;
        }
        return (high - low)/2 + 1;
        
        }
}
        