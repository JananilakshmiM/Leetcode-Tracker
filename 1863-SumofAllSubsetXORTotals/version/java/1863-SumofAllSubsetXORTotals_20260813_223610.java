// Last updated: 13/08/2026, 22:36:10
1class Solution {
2    public String categorizeBox(int length, int width, int height, int mass) {
3
4        long volume = (long) length * width * height;
5
6        boolean bulky = false;
7        boolean heavy = false;
8
9        if (length >= 10000 || width >= 10000 ||
10            height >= 10000 || volume >= 1000000000L) {
11            bulky = true;
12        }
13
14        if (mass >= 100) {
15            heavy = true;
16        }
17
18        if (bulky && heavy) {
19            return "Both";
20        }
21
22        if (bulky && !heavy) {
23            return "Bulky";
24        }
25
26        if (!bulky && heavy) {
27            return "Heavy";
28        }
29
30        return "Neither";
31    }
32}