// Last updated: 09/07/2026, 15:12:31
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int i = 1;
        int j = x / 2;
        int ans = 0;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return ans;
     
    }
}