// Last updated: 01/10/2026, 09:11:20
1class Solution {
2    public int reinitializePermutation(int n) {
3        int[] perm = new int[n];
4        for (int i = 0; i < n; i++) {
5            perm[i] = i;
6        }
7        int count = 0;
8        while (true) {
9            int[] arr = new int[n];
10
11            for (int i = 0; i < n; i++) {
12                if (i % 2 == 0) {
13                    arr[i] = perm[i / 2];
14                } else {
15                    arr[i] = perm[n / 2 + (i - 1) / 2];
16                }
17            }
18            perm = arr;
19            count++;
20            boolean same = true;
21            for (int i = 0; i < n; i++) {
22                if (perm[i] != i) {
23                    same = false;
24                    break;
25                }
26            }
27            if (same) {
28                return count;
29            }
30        }
31    }
32}