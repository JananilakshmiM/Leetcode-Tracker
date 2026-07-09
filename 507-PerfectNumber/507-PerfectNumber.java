// Last updated: 09/07/2026, 15:09:52
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        int sum = 1;
        for(int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                int pair = num / i;
                if(pair != 1) {
                    sum += pair;
                }
            }

        }  
        return sum == num;      
    }
}