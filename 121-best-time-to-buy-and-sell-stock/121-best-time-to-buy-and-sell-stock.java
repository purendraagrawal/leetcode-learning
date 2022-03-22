class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bp = prices[0];
        for(int i = 1;i<prices.length;i++){
             if(prices[i]<bp){
                 bp = prices[i];
             }else if(prices[i]-bp>profit){
                 profit = prices[i]-bp;
             }
        }
        return profit;
    }
}