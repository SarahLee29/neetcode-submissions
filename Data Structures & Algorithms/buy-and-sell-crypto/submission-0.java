class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            } else if (prices[i] -minBuy > maxPro) {
                maxPro = prices[i] -minBuy;
            }
        }
        return maxPro;
        
    }
}
