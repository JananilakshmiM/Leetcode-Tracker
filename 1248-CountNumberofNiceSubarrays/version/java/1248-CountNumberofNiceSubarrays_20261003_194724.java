// Last updated: 03/10/2026, 19:47:24
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3  LinkedList<Integer> deq = new LinkedList();
4  deq.add(-1);
5  int res = 0;
6  for (int i = 0; i < nums.length; ++i) {
7    if (nums[i] % 2 == 1) 
8        deq.add(i);
9    if (deq.size() > k + 1) 
10        deq.pop();
11    if (deq.size() == k + 1) 
12        res += deq.get(1) - deq.get(0);
13  }
14  return res;
15}
16}