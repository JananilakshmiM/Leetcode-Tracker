// Last updated: 25/07/2026, 15:57:41
1class Solution {
2    public int dayOfYear(String date) {
3       int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
4       int[] monthsl={31,29,31,30,31,30,31,31,30,31,30,31};
5       String sub1 = date.substring(0,4); 
6       int year = Integer.parseInt(sub1);
7       String sub2 = date.substring(5,7); 
8       int mon = Integer.parseInt(sub2);
9       String sub3 = date.substring(8,10); 
10       int dat = Integer.parseInt(sub3);
11       int res=0;
12       for(int i=0;i<mon-1;i++){
13            res+=months[i];
14       }
15        res+=dat;
16       if(isleap(year) && mon>2){
17            return res+1;
18       } 
19       return res;
20    }
21    public static boolean isleap(int year){
22        boolean leap=false;
23        if(year%4==0){
24            leap=true;
25            if(year%100==0){
26                if(year%400==0){
27                    leap=true;
28                }
29                else{
30                    leap=false;
31                }
32            }
33        }
34        return leap;
35    }
36}