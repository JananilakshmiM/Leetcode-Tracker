// Last updated: 09/07/2026, 15:11:31
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            else if (nums[mid] < nums[high]) {
                high = mid;
            } 
            else {
                high--;
            }
        }

        return nums[low];
    }
}
