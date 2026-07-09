// Last updated: 09/07/2026, 15:05:30
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=-1;
        int totalSum=0;
        for(int num:nums){
            int currentRange=getDigitRange(num);
            if(currentRange>maxRange){
                maxRange=currentRange;
                totalSum=num;
            } else if(currentRange==maxRange){
                totalSum+=num;
            }
        }
        return totalSum;
        
    }
    private int getDigitRange(int num){
        int n=Math.abs(num);
        if(n==0) return 0;
        int maxDigit=0;
        int minDigit=9;
        while(n>0){
            int digit=n%10;
            if(digit>maxDigit) maxDigit=digit;
            if(digit<minDigit) minDigit=digit;
            n /= 10;
        }
        return maxDigit-minDigit;
    }
}