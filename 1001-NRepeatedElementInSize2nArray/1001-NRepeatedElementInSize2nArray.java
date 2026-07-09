// Last updated: 09/07/2026, 15:08:58
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int x : nums) {
            if(set.contains(x)) {
                return x;
                
            }
            set.add(x);
        }
        return -1;
        
    }
}