// Last updated: 14/10/2026, 12:17:32
1class Solution {
2    public int carFleet(int target, int[] position, int[] speed) {
3        int n = position.length;
4        double[][] fleetArr = new double[n][2];
5
6        for (int i = 0; i < n; i++) {
7            int currPos = position[i];
8            int currSpeed = speed[i];
9            double timeReq = (double) (target - currPos) / currSpeed;
10            fleetArr[i] = new double[] { position[i], timeReq }; 
11        }
12
13        Arrays.sort(fleetArr, (a, b) -> Double.compare(a[0], b[0]));
14        int[] st = new int[n];
15        int ptr = -1;
16
17        for (int i = n - 1; i >= 0; i--) {
18            double timeReq = fleetArr[i][1]; 
19
20            if (ptr < 0 || timeReq > fleetArr[st[ptr]][1]) 
21                st[++ptr] = i;
22        }
23        return ptr + 1;
24    }
25}