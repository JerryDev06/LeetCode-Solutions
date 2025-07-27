class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit=0;
        int min = prices[0];
        for(int i=0; i<len; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int difference = prices[i]-min;
                if(profit<difference){
                    profit = difference;
                }
            }
        }
        return profit;
    }
}
