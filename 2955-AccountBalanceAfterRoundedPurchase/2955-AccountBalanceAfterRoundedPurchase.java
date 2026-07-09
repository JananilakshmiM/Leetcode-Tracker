// Last updated: 09/07/2026, 15:06:19
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if (purchaseAmount % 10 <= 4) return 100 - (purchaseAmount / 10) * 10;
        else return 100 - ((purchaseAmount / 10) + 1) * 10;
        
        
    }
}