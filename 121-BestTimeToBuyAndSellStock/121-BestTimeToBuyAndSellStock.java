// Last updated: 09/07/2026, 15:11:57
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices)
        if(price < min) {
            min = price;
        }
        else if(price - min > maxProfit) {
            maxProfit = price - min;
        }
        return maxProfit;
    }
}