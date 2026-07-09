// Last updated: 09/07/2026, 15:13:22
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        int totalElements = m + n;
        int halfLen = (totalElements + 1) / 2;
        
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = halfLen - partitionX;
            
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if (totalElements % 2 != 0) {
                    return (double) Math.max(maxLeftX, maxLeftY);
                } 
                else {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                }
            } 
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } 
            else {
                low = partitionX + 1;
            }
        }
        
        return 0.0;
    }
}
