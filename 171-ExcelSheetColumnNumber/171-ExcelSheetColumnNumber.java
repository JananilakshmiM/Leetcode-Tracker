// Last updated: 09/07/2026, 15:11:25
class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            res = (res * 26) + (s.charAt(i) - 64);

        }
        return res;
        
    }
}