// Last updated: 25/07/2026, 16:27:27
1class Solution {
2    public int countLargestGroup(int n) {
3        Map<Integer, Integer> map = new HashMap<>();
4        int maxSize = 0;
5
6        for (int i = 1; i <= n; i++) {
7            int sum = 0, num = i;
8            while (num > 0) {
9                sum += num % 10;
10                num /= 10;
11            }
12            map.put(sum, map.getOrDefault(sum, 0) + 1);
13            maxSize = Math.max(maxSize, map.get(sum));
14        }
15
16        int count = 0;
17        for (int val : map.values()) {
18            if (val == maxSize) count++;
19        }
20        return count;
21    }
22}