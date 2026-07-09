// Last updated: 09/07/2026, 15:10:15
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        long j = num;
        while(i <= j) {
            long mid = (i + j) / 2;
            long s = (long) mid*mid;
            if(s == num) {
                return true;
                }
                else if(s < num) {
                    i = mid + 1;
                }
                else {
                    j = mid - 1;
                }
            }
        return false;       
    }
}