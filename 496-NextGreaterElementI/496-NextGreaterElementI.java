// Last updated: 09/07/2026, 15:09:55
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        Stack <Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        for(int x:nums2) {
            while(!stack.empty() && x > stack.peek())
                hm.put(stack.pop(),x);
                stack.push(x);
            }
            for(int i = 0; i < nums1.length; i++) {
                if(hm.containsKey(nums1[i])) {
                    res[i] = hm.get(nums1[i]);
                }
            }
             return res;
    }
}