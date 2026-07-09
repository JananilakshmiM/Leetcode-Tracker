// Last updated: 09/07/2026, 15:05:57
import java.util.*;

class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int place = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                list.add(digit * place);
            }
            n /= 10;
            place *= 10;
        }

        Collections.reverse(list);

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}