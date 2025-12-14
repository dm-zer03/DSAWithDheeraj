
// TC:O(n)
public class Stock {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // Profit case  prices[i] == current day prices 
            // that is high : Profit opportunity : Sell 
            if (buyPrice < prices[i]) {
                // Calc profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // prices[i] is low ; buy today and sell in future when the /
                // SP is more 
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        // 1 and 6 diff :Max Profit :5 
        System.out.println("Profit:" + buyAndSellStocks(prices));
    }
}
