package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/

Best Time to Buy and Sell Stock II

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.

Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.

Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.

Constraints:

1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104
*/

class BestTimeToBuyAndSellStockII {
    
    public int maxProfit(int[] a) {
        int profit = 0;
        int len = a.length;
        if (2 <= len) {
            int i = 1;
            int buy = 0;
            int sell = 0;
            while (i < len) {
                // if price ramps up
                if (a[i-1] < a[i]) {
                    // buy the stock
                    buy = a[i-1];
                    // save sell option
                    sell = a[i];
                    i++;
                    // wait if sell price is growing
                    while (i < len && sell <= a[i]) {
                        sell = a[i];
                        i++;
                    }
                    // sell the stock
                    profit += sell - buy;
                }
                
                // otherwise (price goes down) - skip the day
                i++;
            }
        }
        return profit;
    }
    
    // simple one pass!
    // public int maxProfit(int[] prices) {
    //     int maxprofit = 0;
    //     for (int i = 1; i < prices.length; i++) {
    //         if (prices[i] > prices[i - 1])
    //             maxprofit += prices[i] - prices[i - 1];
    //     }
    //     return maxprofit;
    // }
    
    // peak valley approach
    // public int maxProfit(int[] prices) {
    //     int i = 0;
    //     int valley = prices[0];
    //     int peak = prices[0];
    //     int maxprofit = 0;
    //     while (i < prices.length - 1) {
    //         while (i < prices.length - 1 && prices[i] >= prices[i + 1])
    //             i++;
    //         valley = prices[i];
    //         while (i < prices.length - 1 && prices[i] <= prices[i + 1])
    //             i++;
    //         peak = prices[i];
    //         maxprofit += peak - valley;
    //     }
    //     return maxprofit;
    // }
}
