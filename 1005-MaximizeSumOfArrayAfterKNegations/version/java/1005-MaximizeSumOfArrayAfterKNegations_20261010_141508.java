// Last updated: 10/10/2026, 14:15:08
1class Solution {
2    public int largestSumAfterKNegations(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for (int num : nums) {
5            pq.offer(num);
6        }
7        while (k > 0) {
8            pq.offer(-pq.poll());
9            k--;
10        }
11        int sum = 0;
12
13        while (!pq.isEmpty()) {
14            sum += pq.poll();
15        }
16        return sum;
17    }
18}