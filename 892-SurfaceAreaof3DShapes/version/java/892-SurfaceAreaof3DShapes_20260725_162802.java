// Last updated: 25/07/2026, 16:28:02
1class Solution {
2    public int xorOperation(int n, int start) {
3        int[] nums = new int[n];
4        for(int i=0;i<n;i++){
5            nums[i] = start + 2*i;
6        }
7
8        int xor = nums[0];
9        for(int i=1;i<n;i++){
10            xor = xor^nums[i];
11        }
12
13        return xor;   
14    }
15}