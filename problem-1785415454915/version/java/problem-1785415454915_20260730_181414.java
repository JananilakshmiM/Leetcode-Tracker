// Last updated: 30/07/2026, 18:14:14
1class Solution {
2    public int Calculate(int n){
3        int sum = 0;
4        while(n!=0){
5           sum = sum + n%10;
6            n = n/10;
7        }
8        return sum;
9    }
10    public int countEven(int num) {
11        int count = 0;
12        for(int i=2;i<=num;i++){
13            if(Calculate(i)%2==0){
14                count++;
15            }
16        }
17        return count;
18    }
19}