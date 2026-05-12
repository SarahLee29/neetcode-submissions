class Solution {
    public int maxProfit(int[] prices) {
        int pro = 0;
        for (int window = 1; window < prices.length; window++) {
            for (int r = window; r < prices.length; r++) {
                pro = Math.max(prices[r] - prices[r-window],pro);
            }          
        } 
        return pro;       
    }

   
}
