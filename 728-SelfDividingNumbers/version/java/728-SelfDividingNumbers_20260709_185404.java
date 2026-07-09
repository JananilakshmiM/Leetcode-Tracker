// Last updated: 09/07/2026, 18:54:04
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> ans = new ArrayList<>();
4
5        for (int i = left; i <= right; i++) {
6            int num = i;
7            boolean valid = true;
8
9            while (num > 0) {
10                int digit = num % 10;
11
12                if (digit == 0 || i % digit != 0) {
13                    valid = false;
14                    break;
15                }
16
17                num /= 10;
18            }
19
20            if (valid) {
21                ans.add(i);
22            }
23        }
24
25        return ans;
26    }
27}