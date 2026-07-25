// Last updated: 25/07/2026, 15:58:48
1class Solution {
2    public int numPrimeArrangements(int n) {
3        int count=0;
4        for(int i=2;i<=n;i++){
5            if(isPrime(i)) count++;
6        }
7        long result=(fact(count)*fact(n-count))%1000000007;
8        return (int) result;
9
10    }
11
12    public static boolean isPrime(int n){
13        if(n==2 || n==3) return true;
14        if(n%2==0 || n%3==0) return false;
15        for(int i=5;i*i<=n;i+=6){
16            if(n%i==0 || n%(i+2)==0) return false;
17        }
18        return true;
19    }
20
21    public static long fact(int n){
22        long res=1;
23        for(int i=2;i<=n;i++){
24            res=(res*i)%1000000007;
25        }
26        return res;
27    }
28}