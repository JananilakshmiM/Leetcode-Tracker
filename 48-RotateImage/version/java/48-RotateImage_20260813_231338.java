// Last updated: 13/08/2026, 23:13:38
1class Solution
2{
3    public int poorPigs(int buckets, int tdie, int ttest)
4    {
5        int test = ttest/tdie;
6        int i=0;
7        while(Math.pow(test+1,i)< buckets)
8        {
9            i++;
10        }
11        return i;
12    }
13}