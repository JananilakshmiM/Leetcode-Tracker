// Last updated: 07/08/2026, 18:29:48
1 public class Solution {
2    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
3        if (k < 1 || t < 0) return false;
4        Map<Long, Long> map = new HashMap<>();
5        for (int i = 0; i < nums.length; i++) {
6            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
7            long bucket = remappedNum / ((long) t + 1);
8            if (map.containsKey(bucket)
9                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
10                        || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= t))
11                            return true;
12            if (map.entrySet().size() >= k) {
13                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
14                map.remove(lastBucket);
15            }
16            map.put(bucket, remappedNum);
17        }
18        return false;
19    }
20}