// Last updated: 09/07/2026, 15:05:45
class Solution {
    public String largestEven(String s) {
        for(int i = s.length() - 1; i >= 0; i --){
            int d = s.charAt(i) - '0';
            if(d % 2 == 0){
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}