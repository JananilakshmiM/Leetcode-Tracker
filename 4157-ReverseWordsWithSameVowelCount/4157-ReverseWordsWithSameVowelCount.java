// Last updated: 09/07/2026, 15:05:55
class Solution {
    public String reverseWords(String s) {
        String[] w = s.split(" ");
        int v = count(w[0]);
        for(int i = 1; i < w.length; i++) {
            if (count(w[i]) == v){
                w[i] = new
                StringBuilder(w[i]).reverse().toString();
            }
        }
        return String.join(" ", w);
        
    }
    int count(String s) {
        int c = 0;
        for(char ch:s.toCharArray())
            if("aeiou".indexOf(ch) != -1)c++;
        return c;
    }
}