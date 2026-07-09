// Last updated: 09/07/2026, 15:07:57
class Solution {
    private List<String> list = new ArrayList<>();

    public String getHappyString(int n, int k) {
        backtrack(n, new StringBuilder());

        if (k > list.size()) {
            return "";
        }

        return list.get(k - 1);
    }

    private void backtrack(int n, StringBuilder sb) {
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        char[] chars = {'a', 'b', 'c'};

        for (char ch : chars) {
            if (sb.length() > 0 &&
                sb.charAt(sb.length() - 1) == ch) {
                continue;
            }

            sb.append(ch);
            backtrack(n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}