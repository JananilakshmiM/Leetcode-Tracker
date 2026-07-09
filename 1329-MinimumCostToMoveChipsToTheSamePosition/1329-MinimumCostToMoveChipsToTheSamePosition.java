// Last updated: 09/07/2026, 15:08:12
class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;
        for(int x:position) {
            if(x % 2 != 0) oddCount++;
            if(x % 2 == 0) evenCount++;
        }
        return evenCount < oddCount ? evenCount:oddCount;

        
    }
}