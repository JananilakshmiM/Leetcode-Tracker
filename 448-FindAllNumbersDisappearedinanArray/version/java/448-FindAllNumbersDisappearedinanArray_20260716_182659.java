// Last updated: 16/07/2026, 18:26:59
1class Solution {
2        public List<Integer> findDisappearedNumbers(int[] nums) {
3        for (int i : nums) {
4            int index = Math.abs(i);
5            if (nums[index - 1] > 0) {
6                nums[index - 1] *= -1;
7            }
8        }
9        List<Integer> res = new ArrayList<>();
10        for (int i = 0; i < nums.length; i++) {
11            if (nums[i] > 0) {
12                res.add(i + 1);
13            }
14        }
15        return res;
16    }
17}