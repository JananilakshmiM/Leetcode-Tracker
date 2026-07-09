// Last updated: 09/07/2026, 15:13:16
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = convert(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            int curr = convert(s.charAt(i));
            int next = convert(s.charAt(i + 1));

            if (curr < next) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }

    private int convert(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}