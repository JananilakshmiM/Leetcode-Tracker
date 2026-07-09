// Last updated: 09/07/2026, 15:07:42
class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;

        for (char c : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, c - '0');
        }

        return maxDigit;
    }
}