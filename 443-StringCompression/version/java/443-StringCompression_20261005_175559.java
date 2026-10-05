// Last updated: 05/10/2026, 17:55:59
1class Solution {
2    public int compress(char[] chars) {
3        int n = chars.length;
4        int idx = 0;
5        for (int i = 0; i < n; i++) {
6            char ch = chars[i];
7            int count = 0;
8            while (i < n && chars[i] == ch) {
9                count++;
10                i++;
11            }
12            if (count == 1) {
13                chars[idx++] = ch;
14            } else {
15                chars[idx++] = ch;
16                for (char digit : Integer.toString(count).toCharArray()) {
17                    chars[idx++] = digit;
18                }
19            }
20            i--;
21        }
22        return idx;
23    }
24}
25