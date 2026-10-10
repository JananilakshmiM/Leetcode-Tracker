// Last updated: 10/10/2026, 09:19:47
1class Solution {
2    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
3        int n = quality.length;
4
5        double[][] workers = new double[n][2];
6
7        for (int i = 0; i < n; i++) {
8            workers[i][0] = (double) wage[i] / quality[i];
9            workers[i][1] = i;
10        }
11
12        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
13
14        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
15
16        long qualitySum = 0;
17        double result = Double.MAX_VALUE;
18
19        for (int i = 0; i < n; i++) {
20            int idx = (int) workers[i][1];
21            int q = quality[idx];
22
23            pq.offer(q);
24            qualitySum += q;
25
26            if (pq.size() > k) {
27                qualitySum -= pq.poll();
28            }
29
30            if (pq.size() == k) {
31                double ratio = workers[i][0];
32                result = Math.min(result, ratio * qualitySum);
33            }
34        }
35
36        return result;
37    }
38}