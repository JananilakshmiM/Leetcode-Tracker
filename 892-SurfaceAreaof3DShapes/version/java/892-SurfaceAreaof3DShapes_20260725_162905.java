// Last updated: 25/07/2026, 16:29:05
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum = 0;
4        for (int i = 0; i < arr.length; i++)
5            sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
6        return sum;
7    }
8}