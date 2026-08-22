class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int bestbuy =prices[0] ;
        for(int i=1;i<prices.length;i++){
            int currentprice = prices[i];
            if(currentprice>bestbuy){
                maxprofit=Math.max(maxprofit,currentprice-bestbuy);
            }
            bestbuy = Math.min(bestbuy,currentprice);
        }
        return maxprofit;


        
    }
}