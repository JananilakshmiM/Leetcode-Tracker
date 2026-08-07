// Last updated: 07/08/2026, 18:23:47
1class Solution {
2    public int calPoints(String[] ops) {
3        Stack<Integer> stack = new Stack();
4        int ans = 0;
5        for(String op : ops) {
6            if (op.equals("+")) {
7                int top = stack.pop();
8                int newtop = top + stack.peek();
9                stack.push(top);
10                stack.push(newtop);
11            } else if (op.equals("C")) {
12                ans -= stack.pop();
13                continue;
14            } else if (op.equals("D")) {
15                stack.push(2 * stack.peek());
16            } else {
17                stack.push(Integer.valueOf(op));
18            }
19            ans += stack.peek();
20        }
21        return ans;
22    }
23}