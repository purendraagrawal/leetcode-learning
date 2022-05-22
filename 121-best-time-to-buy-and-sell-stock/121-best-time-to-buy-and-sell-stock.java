class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int bp = prices[0];
        for(int i= 1; i < len ; i++){
            if(bp > prices[i]){
                bp = prices[i];
            }else{
                int sp = prices[i];
                profit = Math.max(profit, sp - bp);
            }
        }
        return profit;
    }
}