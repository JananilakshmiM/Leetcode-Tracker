// Last updated: 07/08/2026, 18:27:13
1public class Solution {
2public int firstMissingPositive(int[] nums) {
3    int n = nums.length;
4    for (int i = 0; i < n; i++) {
5        if (nums[i] <= 0 || nums[i] > n) {
6            nums[i] = n + 1;
7        }
8    }
9    for (int i = 0; i < n; i++) {
10        int num = Math.abs(nums[i]);
11        if (num > n) {
12            continue;
13        }
14        num--; 
15        if (nums[num] > 0) {
16            nums[num] = -1 * nums[num];
17        }
18    }
19    for (int i = 0; i < n; i++) {
20        if (nums[i] >= 0) {
21            return i + 1;
22        }
23    }
24    return n + 1;
25}
26}