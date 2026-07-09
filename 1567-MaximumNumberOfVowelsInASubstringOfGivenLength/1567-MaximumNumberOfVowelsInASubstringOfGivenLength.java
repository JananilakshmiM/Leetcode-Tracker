// Last updated: 09/07/2026, 15:07:55
class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        if(i>=k) {
            char left = s.charAt(i-k);
            if(left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u'){
                count--;
            }
        }
        if(i>=k-1){
            max=Math.max(max,count);
        }
        }
        return max;

        
    }
}