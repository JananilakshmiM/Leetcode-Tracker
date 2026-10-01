// Last updated: 01/10/2026, 10:02:02
1class Solution {
2    public int[] closestPrimes(int left, int right) {
3        boolean[] sieve = new boolean[right + 1];
4        Arrays.fill(sieve, true);
5        sieve[0] = sieve[1] = false;
6        
7        for (int i = 2; i * i <= right; i++) {
8            if (sieve[i]) {
9                for (int j = i * i; j <= right; j += i) {
10                    sieve[j] = false;
11                }
12            }
13        }
14        
15        List<Integer> primes = new ArrayList<>();
16        for (int i = left; i <= right; i++) {
17            if (sieve[i]) {
18                primes.add(i);
19            }
20        }
21        
22        if (primes.size() < 2) {
23            return new int[]{-1, -1};
24        }
25        
26        int minGap = Integer.MAX_VALUE;
27        int[] result = {-1, -1};
28        
29        for (int i = 1; i < primes.size(); i++) {
30            int gap = primes.get(i) - primes.get(i - 1);
31            if (gap < minGap) {
32                minGap = gap;
33                result[0] = primes.get(i - 1);
34                result[1] = primes.get(i);
35            }
36        }
37        
38        return result;
39    }
40}