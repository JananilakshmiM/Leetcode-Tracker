// Last updated: 13/10/2026, 18:54:36
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        int[] cnt = new int[1001];
4        for(int n : arr1) cnt[n]++;
5        int i = 0;
6        for(int n : arr2) {
7            while(cnt[n]-- > 0) {
8                arr1[i++] = n;
9            }
10        }
11        for(int n = 0; n < cnt.length; n++) {
12            while(cnt[n]-- > 0) {
13                arr1[i++] = n;
14            }
15        }
16        return arr1;
17    }
18}