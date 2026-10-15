// Last updated: 15/10/2026, 18:03:45
1class Solution {
2    public List<Integer> pancakeSort(int[] arr) {
3        Stack<Integer> stack = new Stack<>();
4        int n = arr.length;
5        int[] indices = new int[n];
6        for(int i=0; i<n; ++i) indices[arr[i]-1] = i;
7        for(int i=0; i<n; ++i) {
8            int pull = indices[i];
9            dew(stack, i, pull);
10            indices[arr[i]-1] = pull;
11            indices[i] = i;
12            arr[pull] = arr[i];
13            arr[i] = i+1;
14        }
15        LinkedList<Integer> ans = new LinkedList<>();
16        while(!stack.isEmpty()) {
17            int x = stack.pop();
18            ans.addFirst(x);
19        }
20        return ans;
21    }
22    
23    private void dew(Stack<Integer> stack, int j, int i) {
24        if(i != j) {
25            add(stack, i+1);
26            add(stack, i-j+1);
27            add(stack, i-j);
28            add(stack, i-j-1);
29            add(stack, i-j);
30            add(stack, i+1);
31        }
32    }
33    
34    private void add(Stack<Integer> stack, int x) {
35        if(x > 1) {
36            if(!stack.isEmpty() && stack.peek() == x) stack.pop();
37            else stack.push(x);
38        }
39    }
40}