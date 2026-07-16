// Last updated: 16/07/2026, 18:25:27
1class NumArray {
2
3    int[] nums;
4
5    public NumArray(int[] nums) {
6        this.nums = nums;
7    }
8
9    public int sumRange(int left, int right) {
10        int sum = 0;
11
12        for (int i = left; i <= right; i++)
13            sum += nums[i];
14
15        return sum;
16    }
17}
18
19/**
20 * Your NumArray object will be instantiated and called as such:
21 * NumArray obj = new NumArray(nums);
22 * int param_1 = obj.sumRange(left,right);
23 */