// Last updated: 09/07/2026, 18:57:42
1class Solution {
2    public boolean hasGroupsSizeX(int[] deck) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for (int card : deck) {
6            map.put(card, map.getOrDefault(card, 0) + 1);
7        }
8
9        int gcd = 0;
10
11        for (int count : map.values()) {
12            gcd = findGCD(gcd, count);
13        }
14
15        return gcd >= 2;
16    }
17
18    private int findGCD(int a, int b) {
19        while (b != 0) {
20            int temp = b;
21            b = a % b;
22            a = temp;
23        }
24        return a;
25    }
26}