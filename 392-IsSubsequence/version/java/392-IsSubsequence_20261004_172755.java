// Last updated: 04/10/2026, 17:27:55
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.isEmpty()){
4            return true;   
5        }
6        int s_index=0;
7        int t_index=0;
8        while(s_index < s.length() && t_index < t.length()){
9            if(s.charAt(s_index) == t.charAt(t_index)){           
10                s_index++;                                      
11            }
12            t_index++;                                              
13        }
14        return s_index ==s .length();
15    }
16}