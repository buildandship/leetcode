package lp.ds.arrays;

public class FindTheCountOfNumbersWithEvenDigits {
  public static void main(String[] args) {
    //
    int[] nums1 = {12, 345, 2, 6, 7896};
    int[] nums2 = {555, 901, 482, 1771};
    System.out.println(findNumbers(nums1));
    System.out.println(findNumbers(nums2));
  }

  public static int findNumbers(int[] nums) {
    int evenDigitsCount = 0;
    for (int n : nums) {
      if (String.valueOf(n).length() % 2 == 0) {
        evenDigitsCount++;
      }
    }
    return evenDigitsCount;
  }

  static int getDigitCount(int num) {
    int digitCount = 0;
    while (num > 0) {
      digitCount++;
      num = num / 10;
    }
    return digitCount;
  }
}
