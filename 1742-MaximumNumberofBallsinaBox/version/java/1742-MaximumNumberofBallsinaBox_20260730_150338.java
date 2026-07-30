// Last updated: 30/07/2026, 15:03:38
1class Solution {
2    public int countBalls(int lowLimit, int highLimit) {
3        HashMap<Integer, Integer> balls = new HashMap<>();
4
5
6        for(int i = lowLimit ; i <= highLimit ; i++){
7             int boxNumber = sumlimit(i);
8            balls.put(boxNumber , balls.getOrDefault(boxNumber, 0) + 1);
9        }
10
11        Integer maxValue = Collections.max(balls.values());
12        return maxValue;
13    }
14    public int sumlimit(int n){
15        int sum = 0;
16        while(n>0){
17            sum += n%10;
18            n /= 10;
19        }
20        return sum;
21    }
22}