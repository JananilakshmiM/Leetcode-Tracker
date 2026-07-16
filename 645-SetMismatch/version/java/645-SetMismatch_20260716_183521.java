// Last updated: 16/07/2026, 18:35:21
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3
4        int n = nums.length;
5        int[] ans = new int[2];
6
7        Arrays.sort(nums);
8
9        for (int i = 1; i < n; i++) {
10            if (nums[i] == nums[i - 1]) {
11                ans[0] = nums[i];
12            }
13            if (nums[i] - nums[i - 1] > 1) {
14                ans[1] = nums[i - 1] + 1;
15            }
16        }
17
18        if (nums[0] != 1) {
19            ans[1] = 1;
20        }
21
22        if (nums[n - 1] != n) {
23            ans[1] = n;
24        }
25
26        return ans;
27    }
28}