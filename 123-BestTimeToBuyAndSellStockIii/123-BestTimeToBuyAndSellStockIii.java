// Last updated: 09/07/2026, 15:11:55
class Solution {
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MAX_VALUE;
        int firstProfit = 0;
        int secondBuy = Integer.MAX_VALUE;
        int secondProfit = 0;

        for (int price : prices) {
            firstBuy = Math.min(firstBuy, price);
            
            firstProfit = Math.max(firstProfit, price - firstBuy);
            
            secondBuy = Math.min(secondBuy, price - firstProfit);
            
            secondProfit = Math.max(secondProfit, price - secondBuy);
        }

        return secondProfit;
    }
}
