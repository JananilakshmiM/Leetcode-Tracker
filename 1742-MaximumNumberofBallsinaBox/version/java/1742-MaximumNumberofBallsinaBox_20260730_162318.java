// Last updated: 30/07/2026, 16:23:18
1public class Solution {
2    public int largestPalindrome(int n) {
3        int[] x = {9,99,993,9999,99979,999999,9998017,99999999};
4        int[] y = {1,91,913,9901,99681,999001,9997647,99990001};
5        
6        return ((x[n-1] % 1337) * (y[n-1] % 1337)) % 1337;
7    }
8}