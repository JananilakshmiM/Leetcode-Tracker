// Last updated: 01/10/2026, 10:23:33
1class Solution {
2        public boolean checkPrimeFrequency(int[] nums) {
3        Map<Integer, Integer> counts = new HashMap<>();
4        for (int num : nums) {
5            counts.put(num, counts.getOrDefault(num, 0) + 1);
6        }
7        for (int count : counts.values()) {
8            if (count == 2 || count == 3 || count == 5 || count == 7) {
9                return true;
10            }
11            if (count == 1 || count % 2 == 0 || count % 3 == 0 || count % 5 == 0 || count % 7 == 0) {
12                continue;
13            }
14            return true;
15        }
16        return false;
17    }
18}