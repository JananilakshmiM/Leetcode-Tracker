// Last updated: 14/10/2026, 12:19:42
1class Solution {
2    public int[] sortByBits(int[] arr) { 
3        for(int i=0;i<arr.length;i++)
4        {
5            arr[i]+=Integer.bitCount(arr[i])*10001;
6        }
7        
8        Arrays.sort(arr);
9        
10        for(int i=0;i<arr.length;i++)
11        {
12            arr[i]=arr[i]%10001;
13        }
14        return arr;
15    }
16}