// Last updated: 09/07/2026, 15:07:10
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> ratioMap = new HashMap<>();
        long count = 0;
        for (int[] r : rectangles) {
            double ratio = (double) r[0] / r[1];
            count += ratioMap.getOrDefault(ratio, 0);
            ratioMap.put(ratio,ratioMap.getOrDefault(ratio, 0) + 1);
        }

        return count;
    }
}