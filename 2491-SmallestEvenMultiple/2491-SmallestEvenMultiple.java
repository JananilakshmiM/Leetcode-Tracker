// Last updated: 09/07/2026, 15:07:02
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0) {
            return n;
        }
        else {
            return n * 2;
        }
        
    }
}