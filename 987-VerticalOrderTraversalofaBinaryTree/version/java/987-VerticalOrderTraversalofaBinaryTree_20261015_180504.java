// Last updated: 15/10/2026, 18:05:04
1class Solution {
2    Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new HashMap<>();
3    int minX = 0, maxX = 0;
4    public List<List<Integer>> verticalTraversal(TreeNode root) {
5        helper(root, 0, 0);
6        List<List<Integer>> vertical = new ArrayList<>();
7        for (int i = minX; i <= maxX; i++) {
8            List<Integer> level = new ArrayList<Integer>();
9            for (int key : map.get(i).keySet()) {
10                while (!(map.get(i).get(key)).isEmpty()) {
11                    level.add(map.get(i).get(key).poll());
12                }
13            }
14            vertical.add(level);
15        }
16        return vertical;
17        
18    }
19    
20    private void helper(TreeNode node, int x, int y) {
21        if (node == null) return;
22        minX = Math.min(minX, x);
23        maxX = Math.max(maxX, x);
24        if (map.get(x) == null) { map.put(x, new TreeMap<Integer, PriorityQueue<Integer>>()); }
25        if (map.get(x).get(y) == null) { map.get(x).put(y, new PriorityQueue<Integer>()); }
26        map.get(x).get(y).add(node.val);
27        helper(node.left, x - 1, y + 1);
28        helper(node.right, x + 1, y + 1);   
29
30    }
31}