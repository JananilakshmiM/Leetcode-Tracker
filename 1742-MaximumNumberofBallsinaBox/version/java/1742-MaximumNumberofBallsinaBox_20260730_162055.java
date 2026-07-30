// Last updated: 30/07/2026, 16:20:55
1class Solution {
2    public int minMaxDifference(int num) {
3        String s = Integer.toString(num);
4        char ch = '\0';
5        for (char c : s.toCharArray()) if (c != '9') { ch = c; break; }
6        String mx;
7        if (ch != '\0') {
8            StringBuilder sb = new StringBuilder();
9            for (char c : s.toCharArray()) sb.append(c == ch ? '9' : c);
10            mx = sb.toString();
11        } else {
12            mx = s;
13        }
14        char ch0 = s.charAt(0);
15        StringBuilder sb2 = new StringBuilder();
16        for (char c : s.toCharArray()) sb2.append(c == ch0 ? '0' : c);
17        String mn = sb2.toString();
18        return Integer.parseInt(mx) - Integer.parseInt(mn);
19    }
20}