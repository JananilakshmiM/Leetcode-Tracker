// Last updated: 29/07/2026, 19:13:34
1class Solution {
2    public int[] sumZero(int n) {
3        int[] a = new int[n];
4        int idx = 0;
5
6        if (n % 2 != 0) {
7            a[idx++] = 0;
8        }
9
10        for (int i = 1; i <= n / 2; i++) {
11            a[idx++] = i;
12            a[idx++] = -i;
13        }
14
15        return a;
16        
17    }
18} 