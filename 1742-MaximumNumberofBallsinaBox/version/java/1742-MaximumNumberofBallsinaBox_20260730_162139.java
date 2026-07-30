// Last updated: 30/07/2026, 16:21:39
1class Solution {
2    public int splitNum(int num) {
3        char c[]=String.valueOf(num).toCharArray();
4        Arrays.sort(c);
5        StringBuilder nm=new StringBuilder();
6        StringBuilder kk=new StringBuilder();
7        for(int i=0;i<c.length;i++)
8        {
9            if(i%2==0)
10            {
11                nm.append(c[i]);
12            }
13            else
14            {
15                kk.append(c[i]);
16            }
17        }
18        return Integer.parseInt(nm.toString())+Integer.parseInt(kk.toString());
19    }
20}