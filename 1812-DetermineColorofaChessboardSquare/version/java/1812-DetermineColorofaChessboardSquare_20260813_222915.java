// Last updated: 13/08/2026, 22:29:15
1class Solution {
2    public boolean squareIsWhite(String coordinates) {
3        char[] str=coordinates.toCharArray();
4        int sum=0;
5        sum+=(int)('a'-(str[0]+1));
6        sum+=(int)('1'-(str[1]+1));
7        return sum%2==0?false:true;
8    }
9}