// Last updated: 09/07/2026, 15:09:02
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int result = (max - k) - (min + k);

        return result < 0 ? 0 : result;
    }
}