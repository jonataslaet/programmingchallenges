package best_time_to_buy_and_sell_stock.remove_duplicates_from_sorted_array;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1487206372/
public class Solution {

    public int maxProfit(int[] prices) {
        int a = 0, p = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[a]) {
                a = i;
            }
            else if (prices[i] > prices[a]) {
                int pAux = prices[i] - prices[a];
                if (pAux > p) {
                    p = pAux;
                }
            }
        }
        return p;
    }
}
