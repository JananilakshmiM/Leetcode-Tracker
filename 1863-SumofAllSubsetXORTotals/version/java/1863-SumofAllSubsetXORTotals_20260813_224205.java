// Last updated: 13/08/2026, 22:42:05
1class Solution {
2    public int numberOfChild(int n, int k) {
3        n--;
4        int round = k/n;
5        int rem = k%n;
6        if(round%2==0)return rem;
7        else return n-rem;
8    }
9}