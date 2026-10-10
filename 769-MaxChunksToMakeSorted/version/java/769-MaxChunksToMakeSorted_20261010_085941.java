// Last updated: 10/10/2026, 08:59:41
1class Solution {
2    public int maxChunksToSorted(int[] arr) {
3        int runningSum = 0, expectedSum = 0, chunks = 0;
4        for (int i = 0; i < arr.length; i++) {
5            runningSum += arr[i];
6            expectedSum += i;
7            if (runningSum == expectedSum) {
8                chunks++;
9            }
10        }
11        return chunks;
12    }
13}