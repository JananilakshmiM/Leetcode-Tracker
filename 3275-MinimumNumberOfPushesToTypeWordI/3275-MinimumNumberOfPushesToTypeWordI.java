// Last updated: 09/07/2026, 15:06:18
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (i / 8) + 1;
        }

        return ans;
    }
}