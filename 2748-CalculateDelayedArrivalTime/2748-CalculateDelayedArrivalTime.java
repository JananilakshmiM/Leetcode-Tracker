// Last updated: 09/07/2026, 15:06:33
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime + delayedTime < 24) {
            return arrivalTime + delayedTime;
        }
            else {
                return (arrivalTime + delayedTime)%24;
            }
        
    }
}