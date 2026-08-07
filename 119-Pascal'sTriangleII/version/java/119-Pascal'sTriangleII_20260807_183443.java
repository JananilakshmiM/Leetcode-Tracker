// Last updated: 07/08/2026, 18:34:43
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        int[][] cache = new int[rowIndex + 1][rowIndex + 1];
5        for (int i = 0; i <= rowIndex; i++) {
6            row.add(getCell(rowIndex, i, cache));
7        }
8        return row;
9    }
10    public int getCell(int rowIndex, int cellIndex, int[][] cache) {
11        if (cache[rowIndex][cellIndex] != 0) return cache[rowIndex][cellIndex];
12        if (rowIndex == 0) return 1;
13        if (cellIndex == 0 || cellIndex == rowIndex) return 1;
14        cache[rowIndex][cellIndex] = getCell(rowIndex - 1, cellIndex - 1, cache)
15                + getCell(rowIndex - 1, cellIndex, cache);
16        return cache[rowIndex][cellIndex];
17    }
18}