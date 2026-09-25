// Last updated: 25/09/2026, 12:35:45
1class Solution {
2    public int maximumSwap(int num) {
3        char[] digits = Integer.toString(num).toCharArray();
4        
5        int[] buckets = new int[10];
6        for (int i = 0; i < digits.length; i++) {
7            buckets[digits[i] - '0'] = i;
8        }
9        
10        for (int i = 0; i < digits.length; i++) {
11            for (int k = 9; k > digits[i] - '0'; k--) {
12                if (buckets[k] > i) {
13                    char tmp = digits[i];
14                    digits[i] = digits[buckets[k]];
15                    digits[buckets[k]] = tmp;
16                    return Integer.valueOf(new String(digits));
17                }
18            }
19        }
20        
21        return num;
22    }
23}