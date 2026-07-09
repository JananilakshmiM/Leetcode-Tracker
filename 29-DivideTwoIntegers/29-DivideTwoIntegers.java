// Last updated: 09/07/2026, 15:12:58
class Solution {
public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;

    int divide = dividend / divisor;
    return divide;

    
        
    }
};