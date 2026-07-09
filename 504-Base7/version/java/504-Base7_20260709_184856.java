// Last updated: 09/07/2026, 18:48:56
1class Solution {
2    public String convertToBase7(int num) {
3        if (num == 0) {
4            return "0";
5        }
6
7        boolean negative = num < 0;
8        num = Math.abs(num);
9
10        StringBuilder sb = new StringBuilder();
11
12        while (num > 0) {
13            sb.append(num % 7);
14            num /= 7;
15        }
16
17        if (negative) {
18            sb.append("-");
19        }
20
21        return sb.reverse().toString();
22    }
23}