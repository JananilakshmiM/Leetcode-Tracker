// Last updated: 18/07/2026, 20:22:59
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        int[] counts=new int[26];
4        for(int i=0; i<s.length(); i++){
5            counts[s.charAt(i) - 'a']++;
6        }
7        StringBuilder sb=new StringBuilder();
8        int countY=counts[y-'a'];
9        for(int i=0; i<countY; i++){
10            sb.append(y);
11        }
12        counts[y-'a']=0;
13        int countX=counts[x-'a'];
14        counts[x-'a']=0;
15
16        for(int i=0; i<26; i++){
17            while(counts[i]>0){
18                sb.append((char) (i+'a'));
19                counts[i]--;
20            }
21        }
22            for(int i=0; i<countX; i++){
23                sb.append(x);
24            }
25            return sb.toString();
26    }
27}