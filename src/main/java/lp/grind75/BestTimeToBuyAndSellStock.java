package lp.grind75;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best time to buy and
 * sell stock</a>
 */
public class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {

    int[][] stockPrices = {
      {7, 1, 5, 3, 6, 4}, {7, 6, 4, 3, 1} // ,{},{}
    };
    for (int[] prices : stockPrices) {
      System.out.println("MAX PROFIT :: " + maxProfit(prices));
    }
    //
  }

  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    if (prices == null || prices.length == 0) {
      return maxProfit;
    }
    int minPrice = 0;
    for (int price : prices) {}

    return maxProfit;
  }
}
