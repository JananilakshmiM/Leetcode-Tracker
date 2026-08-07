// Last updated: 07/08/2026, 18:25:20
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        HashMap<String, Integer> map = new HashMap<>();
4        for(int i = 0; i < list1.length; i++){
5            map.put(list1[i], i);
6        }
7        ArrayList<String> list = new ArrayList<>();
8        int minSum = Integer.MAX_VALUE;
9        for(int j = 0; j < list2.length; j++){
10            if(map.containsKey(list2[j])){
11                int indexSum = map.get(list2[j]) + j;
12                if(indexSum< minSum){
13                    minSum = indexSum;
14                    list.clear();
15                    list.add(list2[j]);
16                }
17                else if(indexSum == minSum){
18                    list.add(list2[j]);
19                }
20            }
21        }
22        return list.toArray(new String[0]);
23    }
24}