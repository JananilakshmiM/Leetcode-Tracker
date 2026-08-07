// Last updated: 07/08/2026, 18:38:56
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3
4        if (nums1.length > nums2.length)
5            return intersect(nums2, nums1);
6
7        Map<Integer, Integer> map = new HashMap<>();
8
9        for (int n : nums1)
10            map.merge(n, 1, Integer::sum);
11
12        List<Integer> result = new ArrayList<>();
13
14        for (int num : nums2) {
15
16            int remain = map.getOrDefault(num, 0);
17
18            if (remain > 0) {
19                result.add(num);
20                map.put(num, remain - 1);
21            }
22        }
23
24        int[] out = new int[result.size()];
25
26        for (int i = 0; i < out.length; i++)
27            out[i] = result.get(i);
28
29        return out;
30    }
31}