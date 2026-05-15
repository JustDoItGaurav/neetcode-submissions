class Solution {
    public int maxProfit(int[] prices) {
        int low=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(low<prices[i]){
                int currentMax=prices[i]-low;
                maxProfit=Math.max(currentMax,maxProfit);
            }else{
                low=prices[i];
            }
        }
        return maxProfit;
    }
}
