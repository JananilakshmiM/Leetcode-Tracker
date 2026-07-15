// Last updated: 15/07/2026, 21:47:29
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        
4        int n = score.length;
5        String[] res = new String[n];
6        
7        PriorityQueue<Integer> pq = 
8            new PriorityQueue<>((a,b)->score[b]-score[a]);
9        
10        for(int i=0;i<n;i++){
11            pq.add(i);
12        }
13        int i=1;
14        while(!pq.isEmpty()){
15            
16            int idx = pq.poll();
17            
18            if(i>3){
19                res[idx] = Integer.toString(i);
20            }else if(i==1){
21                res[idx] = "Gold Medal";
22            }else if(i==2){
23                res[idx] = "Silver Medal";
24            }else if(i==3){
25                res[idx] = "Bronze Medal";
26            }
27            i++;
28        }
29        
30        return res;
31        
32    }
33}