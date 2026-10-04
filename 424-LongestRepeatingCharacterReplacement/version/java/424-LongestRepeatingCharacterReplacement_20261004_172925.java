// Last updated: 04/10/2026, 17:29:25
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int n = s.length();
4        int[] freq = new int[26];
5        int maxLen = 0, maxFreq = 0, left = 0, right = 0;
6        while(right < n){
7            char ch = s.charAt(right);
8            freq[ch - 'A']++;
9            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
10
11            if((right - left + 1) - maxFreq > k){
12                freq[s.charAt(left) - 'A']--;
13                left++;
14            }
15
16            maxLen = Math.max(maxLen , (right - left + 1));
17            right++;
18        }
19
20        return maxLen;
21    }
22}