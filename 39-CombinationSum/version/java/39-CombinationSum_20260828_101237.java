// Last updated: 28/08/2026, 10:12:37
1class Solution {
2    public void backtrack(int idx,int target,ArrayList<Integer> cur,List<List<Integer>> ans,int ar[]) {
3        if(target==0) {
4            ans.add(new ArrayList<>(cur));
5            return;
6        }
7        if(target<0) {
8            return;
9        }
10        for(int i=idx;i<ar.length;i++) {
11            cur.add(ar[i]);
12            backtrack(i,target-ar[i],cur,ans,ar);
13            cur.remove(cur.size()-1);
14        }
15
16    }
17    public List<List<Integer>> combinationSum(int[] candidates, int target) {
18        List<List<Integer>> ans = new ArrayList<>();
19        backtrack(0,target,new ArrayList<>(),ans,candidates);
20        return ans;
21    }
22}