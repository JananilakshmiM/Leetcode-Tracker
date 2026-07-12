// Last updated: 12/07/2026, 08:56:49
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        int se=convertToSeconds(startTime);
4        int e=convertToSeconds(endTime);
5        int diff=e-se;
6        if(diff<0){
7            diff+=24*3600;
8        }
9        return diff;
10    }
11    private int convertToSeconds(String timeStr){
12        String[] parts=timeStr.split(":");
13        int h=Integer.parseInt(parts[0]);
14        int m=Integer.parseInt(parts[1]);
15        int s=Integer.parseInt(parts[2]);
16        return (h*3600)+(m*60)+s;
17    }
18}