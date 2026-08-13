// Last updated: 13/08/2026, 22:34:57
1class Solution {
2    public static int days(String s){
3        int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
4        int months = Integer.parseInt(s.substring(0,2));
5        int no_days = Integer.parseInt(s.substring(3,5));
6        int total = 0;
7        for(int i = 0; i < months - 1; i++){
8            total += month[i];
9        }
10        total += no_days;
11        return total;
12    }
13    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
14        int aliceStart = days(arriveAlice);
15        int aliceEnd = days(leaveAlice);
16        int bobStart = days(arriveBob);
17        int bobEnd = days(leaveBob);
18        int start = Math.max(aliceStart, bobStart);
19        int end = Math.min(aliceEnd, bobEnd);
20        if(start <= end){
21            return end - start + 1;
22        }else{
23            return 0;
24        }
25    }
26}