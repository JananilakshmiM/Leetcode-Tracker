// Last updated: 29/07/2026, 19:09:15
1class Solution {
2    public int oddCells(int n, int m, int[][] indices) {
3        int count = 0;
4        int row[] = new int [n];
5        int col[] = new int [m];
6        for(int x[] : indices)
7        {
8            row[x[0]]++;
9            col[x[1]]++;
10        }    
11        for(int i=0;i<n;i++)
12            for(int j=0;j<m;j++)
13            {
14                if((row[i]+col[j])%2!=0)
15                    count++;
16            }        
17        return count;
18    }
19}