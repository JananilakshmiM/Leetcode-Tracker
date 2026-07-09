// Last updated: 09/07/2026, 15:07:20
class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
        int MOD = 1_000_000_007;

        long end0 = 0;
        long end1 = 0;
        boolean hasZero = false;

        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                end1 = (end0 + end1 + 1) % MOD;
            } else {
                end0 = (end0 + end1) % MOD;
                hasZero = true;
            }
        }

        return (int) ((end0 + end1 + (hasZero ? 1 : 0)) % MOD);
    }
}