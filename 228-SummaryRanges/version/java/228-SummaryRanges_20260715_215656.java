// Last updated: 15/07/2026, 21:56:56
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<String> summaryRanges(int[] nums) {
6        List<String> result = new ArrayList<>();
7        if (nums.length == 0) {
8            return result;
9        }
10        
11        int i = 0;
12        while (i < nums.length) {
13            int start = nums[i];
14            int j = i;
15            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
16                j++;
17            }
18            if (nums[j] == start) {
19                result.add(String.valueOf(start));
20            } else {
21                result.add(start + "->" + nums[j]);
22            }
23            
24            i = j + 1;
25        }
26        return result;
27    }
28}