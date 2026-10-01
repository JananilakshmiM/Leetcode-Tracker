// Last updated: 01/10/2026, 09:50:30
1class Solution {
2    public int countNicePairs(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        long ans = 0;
5        int mod = 1000000007;
6        for(int num:nums) {
7            int rev = reverse(num);
8            int key = num - rev;
9            if(map.containsKey(key)) {
10                ans += map.get(key);
11            }
12            map.put(key, map.getOrDefault(key, 0) + 1);
13            ans %= mod;
14        }
15        return (int) ans;
16    }
17        public int reverse(int num) {
18            int rev = 0;
19            while(num > 0) {
20                rev = rev * 10 + num % 10;
21                num = num / 10;
22            }
23            return rev;
24    }
25}