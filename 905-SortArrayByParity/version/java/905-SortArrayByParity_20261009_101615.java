// Last updated: 09/10/2026, 10:16:15
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n = nums.length;
4        List<Integer> even = new ArrayList<>();
5        List<Integer> odd = new ArrayList<>();
6        for(int num : nums)
7            {
8                if(num%2==0)even.add(num);
9                else odd.add(num);
10            }
11        for(int i=0;i<even.size();i++)
12            nums[i]=even.get(i);
13
14        int idx = 0;
15        for(int i=even.size();i<n;i++)
16        {
17            nums[i]=odd.get(idx);
18            idx++;
19        }
20        return nums;
21    }
22}