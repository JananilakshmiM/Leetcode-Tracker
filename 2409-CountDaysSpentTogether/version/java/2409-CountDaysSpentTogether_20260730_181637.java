// Last updated: 30/07/2026, 18:16:37
1class Solution {
2    public int diagonalPrime(int[][] nums) {
3
4        int len = nums.length;
5        int max = 0;
6
7        for (int i = 0; i < len; i++) {
8
9            int main = nums[i][i];
10            int secondary = nums[i][len - 1 - i];
11
12            if (main > max && isPrime(main)) {
13                max = main;
14            }
15
16            if (secondary > max && isPrime(secondary)) {
17                max = secondary;
18            }
19        }
20
21        return max;
22    }
23
24    private boolean isPrime(int n) {
25
26        if (n <= 1) {
27            return false;
28        }
29
30        for (int i = 2; i * i <= n; i++) {
31
32            if (n % i == 0) {
33                return false;
34            }
35        }
36
37        return true;
38    }
39}