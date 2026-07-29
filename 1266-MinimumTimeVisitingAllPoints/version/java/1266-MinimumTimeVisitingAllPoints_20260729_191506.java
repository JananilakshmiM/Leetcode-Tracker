// Last updated: 29/07/2026, 19:15:06
1class Solution {
2    public int[] getNoZeroIntegers(int n) {
3        for(int i=0; i<n; i++){
4            int left = i;
5            int right=n-left;
6            if(!String.valueOf(left).contains("0")&&!String.valueOf(right).contains("0"))
7            return new int[] {left,right};
8        }
9        return new int[0];
10    }
11}