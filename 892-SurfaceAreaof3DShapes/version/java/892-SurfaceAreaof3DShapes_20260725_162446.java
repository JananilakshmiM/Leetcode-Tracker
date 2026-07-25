// Last updated: 25/07/2026, 16:24:46
1class Solution {
2    public int maximum69Number (int num) {
3        if(num == 9999 || num == 9996 || num == 9969 || num == 9699 || num == 6999)return 9999;
4        if(num == 999 || num == 996 || num == 969 || num == 699)return 999;
5        if(num == 99 || num == 96 || num == 69)return 99;   
6        if(num == 9966 || num == 9696 || num == 6996)return 9996;
7        if(num == 9669 || num == 6969)return 9969;
8        if(num == 6699)return 9699;
9        if(num == 966 || num == 696)return 996;
10        if(num == 669)return 969;
11        if(num == 66)return 96;
12
13        if(num == 9666 || num == 6966)return 9966;
14        if(num == 6696)return 9696;
15        if(num == 6669)return 9669;
16        if(num == 666)return 966;
17        if(num == 6666)return 9666;
18
19        return 9;
20    }
21}