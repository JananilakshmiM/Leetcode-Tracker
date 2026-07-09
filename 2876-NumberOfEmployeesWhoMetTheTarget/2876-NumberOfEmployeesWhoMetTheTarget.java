// Last updated: 09/07/2026, 15:06:23
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i < hours.length; i++) {
            if(hours[i] >= target) {
                count ++;
            }
        }  
        return count;      
    }
}