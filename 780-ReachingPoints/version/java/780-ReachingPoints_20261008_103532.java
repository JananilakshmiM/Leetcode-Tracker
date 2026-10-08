// Last updated: 08/10/2026, 10:35:32
1class Solution {
2    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
3		 while(tx >= sx && ty >= sy){
4            if(tx > ty) {
5                if(sy == ty) return (tx - sx) % ty == 0;
6                tx %= ty;
7            }
8            else {
9                if(sx == tx) return (ty - sy) % tx == 0;
10                ty %= tx;
11            }
12        }
13        return false;
14    }
15}