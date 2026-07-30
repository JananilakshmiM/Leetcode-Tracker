// Last updated: 30/07/2026, 16:11:48
1class Solution {
2    public int countOperations(int num1, int num2) {
3        if(num1 == 0 || num2 == 0)return 0;
4        if(num1 == num2)return 1;
5        int res = 0;
6
7        while(num1 != num2){
8            while(num1 > num2){
9                num1-=num2;
10                res++;
11            }
12
13            while(num2 > num1){
14                num2-=num1;
15                res++;
16            }
17        }
18
19        return res+1;
20    }
21}