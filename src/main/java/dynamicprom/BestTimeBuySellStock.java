package dynamicprom;

public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        //return 0 when length is 0, or 1.
        if(prices.length < 2) return 0;
        int maxProfit = 0;
        // maxProfit(n) = max([maxProfit(n-1), num[n] - min(n-1))
        int minNum = prices[0];
        for(int i = 1; i < prices.length; i ++) {
            maxProfit = Math.max(maxProfit, prices[i] - minNum);
            if(prices[i] < minNum) {
                minNum = prices[i];
            }
        }
        return maxProfit;
    }
}
