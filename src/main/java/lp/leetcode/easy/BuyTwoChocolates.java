package lp.leetcode.easy;

public class BuyTwoChocolates {
  public static void main(String[] args) {
    System.out.println(new BuyTwoChocolates().buyChoco(new int[] {1, 2, 2}, 3));
    System.out.println(new BuyTwoChocolates().buyChoco(new int[] {3, 2, 3}, 3));
    System.out.println(new BuyTwoChocolates().buyChoco(new int[] {1, 2, 3}, 2));
  }

  public int buyChoco(int[] prices, int money) {
    int min1 = Integer.MIN_VALUE;
    int min2 = Integer.MIN_VALUE;
    for (int p : prices) {
      if (p >= min1) {
        min1 = p;
        min2 = min1;
      } else if (p <= min2) {
        min2 = p;
      }
    }
    int leftOver = money - min1 - min2;

    return leftOver > 0 ? leftOver : money;
  }
}
