// Last updated: 17/07/2026, 07:23:48
1class Solution {
2    
3    public List<List<Integer>> threeSum(int[] nums) {
4        Arrays.sort(nums);
5        List<List<Integer>> res = new ArrayList<>();
6       int n = nums.length;
7       for(int i = 0;i < n - 2;i++){
8        int j = i+1,k = n - 1;
9        
10        if(i > 0 && nums[i] == nums[i-1]) continue;
11        
12        while(j < k){
13            int sum = nums[i] + nums[j] + nums[k];
14            if(sum == 0){
15            res.add(Arrays.asList(nums[i],nums[j],nums[k]));
16            j++;
17            k--;
18            while(j < k && nums[j] == nums[j-1]) j++;
19            }else if(sum < 0) j++;
20            else k--;
21
22        }
23       }
24
25       return res;
26
27    }
28}