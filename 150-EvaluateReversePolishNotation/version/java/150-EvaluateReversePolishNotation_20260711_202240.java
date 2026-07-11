// Last updated: 11/07/2026, 20:22:40
1class Solution {
2    public int evalRPN(String[] tokens) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        for (String token : tokens) {
7
8            switch (token) {
9
10                case "+":
11                    stack.push(stack.pop() + stack.pop());
12                    break;
13
14                case "-":
15                    int b = stack.pop();
16                    int a = stack.pop();
17                    stack.push(a - b);
18                    break;
19
20                case "*":
21                    stack.push(stack.pop() * stack.pop());
22                    break;
23
24                case "/":
25                    int divisor = stack.pop();
26                    int dividend = stack.pop();
27                    stack.push(dividend / divisor);
28                    break;
29
30                default:
31                    stack.push(Integer.parseInt(token));
32            }
33        }
34
35        return stack.pop();
36    }
37}