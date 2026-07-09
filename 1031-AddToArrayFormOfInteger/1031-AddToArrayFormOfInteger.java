// Last updated: 09/07/2026, 15:08:50
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }

            ans.add(k % 10);
            k /= 10;
        }

        while (i >= 0) {
            ans.add(num[i]);
            i--;
        }

        Collections.reverse(ans);
        return ans;
    }
}