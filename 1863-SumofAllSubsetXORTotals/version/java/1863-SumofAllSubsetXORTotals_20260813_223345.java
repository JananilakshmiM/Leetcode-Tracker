// Last updated: 13/08/2026, 22:33:45
1class Solution {
2    public String maximumOddBinaryNumber(String s) {
3        int count0 = 0;
4        int count1 = 0;
5
6        for(int i = 0; i < s.length(); i++) {
7            if(s.charAt(i) == '0') count0++;
8            else count1++;
9        }
10
11        StringBuilder sb = new StringBuilder();
12        sb.append("1");
13        count1--;
14
15        sb.append("0".repeat(count0));
16        sb.append("1".repeat(count1));
17
18        return sb.reverse().toString();
19    }
20}