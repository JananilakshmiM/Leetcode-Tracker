// Last updated: 11/07/2026, 20:28:22
1class Solution {
2
3    public List<Integer> diffWaysToCompute(String expression) {
4
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 0; i < expression.length(); i++) {
8
9            char ch = expression.charAt(i);
10
11            if (ch == '+' || ch == '-' || ch == '*') {
12
13                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
14                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
15
16                for (int l : left) {
17                    for (int r : right) {
18
19                        if (ch == '+')
20                            result.add(l + r);
21
22                        else if (ch == '-')
23                            result.add(l - r);
24
25                        else
26                            result.add(l * r);
27                    }
28                }
29            }
30        }
31
32        if (result.isEmpty()) {
33            result.add(Integer.parseInt(expression));
34        }
35
36        return result;
37    }
38}