// Last updated: 01/08/2026, 20:59:37
1class Solution {
2    public int countValidPrefixes(String s) {
3        int zeros=0;
4        int ones=0;
5        int valid=0;
6        for(int i=0; i<s.length(); i++){
7            if(s.charAt(i)=='0'){
8                zeros++;
9            }
10            else{
11                ones++;
12            }
13            if(Math.abs(zeros-ones)<=1){
14                valid++;
15            }
16        }
17        return valid;
18        
19    }
20}