// Last updated: 30/07/2026, 18:22:54
1class Solution {
2    private int encrypt(int nums){
3        int max = 0;
4        int count = 0;
5        while(nums > 0){
6            int temp = nums%10;
7            max = Math.max(max, temp);
8            count++;
9            nums /= 10;
10        }
11        if(count == 2) max = 11 * max;
12        if(count == 3) max = 111 * max;
13        if(count == 4) max = 1111 * max;
14        return max;
15    }
16    public int sumOfEncryptedInt(int[] nums) {
17        int sum = 0;
18        for(int i = 0; i < nums.length; i++){
19            if(nums[i] < 10){
20                sum += nums[i];
21            }
22            if(nums[i] >= 10){
23                sum += encrypt(nums[i]);
24            }
25        }
26        return sum;
27    }
28}