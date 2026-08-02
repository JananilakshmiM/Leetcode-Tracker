// Last updated: 02/08/2026, 09:07:34
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long max=0;
4        int n=nums.length;
5
6        for(int i=0; i<n; i++){
7            for(int j=i+1; j<n; j++){
8                long val1=nums[i];
9                long val2=nums[j];
10                long g=gcd(val1,val2);
11                long s=(val1*val2)/(g*g);
12                max=Math.max(max,s);
13            }
14        }
15        return max;
16    }
17    private long gcd(long a, long b){
18        while(b!=0){
19            long temp=b;
20            b=a%b;
21            a=temp;
22        }
23        return a;
24    }
25}