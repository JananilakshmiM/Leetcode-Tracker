// Last updated: 09/07/2026, 15:10:06
class Solution {
public:
    int arrangeCoins(int n) {
        int row = 1;
        while(n>=row) {
            n -= row;
            row++;
        }
        return row - 1;
        
    }
};