// Last updated: 03/10/2026, 19:43:34
1class Solution {
2        public int findMinDifference(List<String> timePoints) {
3        int res = Integer.MAX_VALUE;
4        int N = timePoints.size();
5        int[] c = new int[N];
6        
7        for (int i = 0; i < N; i++) {
8            String s = timePoints.get(i);
9            c[i] = Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5));
10        }
11        Arrays.sort(c);
12        for (int i = 1; i < N; i++) {
13            res = Math.min(res, c[i] - c[i - 1]);
14        }
15        res = Math.min(res, c[0] + (24*60 - c[N - 1]));
16        return res;
17    }
18}