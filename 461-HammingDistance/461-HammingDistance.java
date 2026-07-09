// Last updated: 09/07/2026, 15:09:57
class Solution {
public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while(xor != 0) {
            xor = (xor & (xor - 1));
            count++;
        }
        return count;
         }
};