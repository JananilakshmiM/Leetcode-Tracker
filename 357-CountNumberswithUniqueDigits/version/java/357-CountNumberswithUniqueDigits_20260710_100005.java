// Last updated: 10/07/2026, 10:00:05
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if (n == 0)    return 1;
4        
5        int res = 10;
6        int uniqueDigits = 9;
7        int availableNumber = 9;
8        while (n-- > 1 && availableNumber > 0) {
9            uniqueDigits = uniqueDigits * availableNumber;
10            res += uniqueDigits;
11            availableNumber--;
12        }
13        return res;
14    }
15}