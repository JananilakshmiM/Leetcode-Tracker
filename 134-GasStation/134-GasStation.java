// Last updated: 09/07/2026, 15:11:48
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int remGas = 0;
        int ans = 0;
        for(int i = 0; i < gas.length; i++) {
            totalcost += gas[i] - cost[i];
            remGas += gas[i] - cost[i];
        if(remGas < 0) {
            remGas = 0;
            ans = i + 1;
        }
    }
        return totalcost >= 0 ? ans : -1;



    }
}