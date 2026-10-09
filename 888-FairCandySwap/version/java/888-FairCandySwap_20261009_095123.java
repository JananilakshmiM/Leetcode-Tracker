// Last updated: 09/10/2026, 09:51:23
1class Solution {
2    public int[] fairCandySwap(int[] alice, int[] bob) {
3        int sumA = 0, sumB = 0;
4
5        for (int a : alice) sumA += a;
6        for (int b : bob) sumB += b;
7
8        int diff = (sumB - sumA) / 2;
9        Set<Integer> setB = new HashSet<>();
10        for (int b : bob) setB.add(b);
11
12        for (int a : alice) {
13            if (setB.contains(a + diff)) {
14                return new int[]{a, a + diff};
15            }
16        }
17        return new int[]{};
18    }
19}