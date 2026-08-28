// Last updated: 28/08/2026, 09:23:46
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> result = new ArrayList<>();
4        generateCombinations(1, n, k, new ArrayList<Integer>(), result);
5        return result;
6    }
7    private void generateCombinations(int start, int n, int k, List<Integer> combination, List<List<Integer>> result) {
8        if (k == 0) {
9            result.add(new ArrayList<>(combination));
10            return;
11        }
12        for (int i = start; i <= n - k + 1; i++) {
13            combination.add(i);
14            generateCombinations(i + 1, n, k - 1, combination, result);
15            combination.remove(combination.size() - 1);
16        }
17    }
18}
19