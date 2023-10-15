package lp.algoexpert;

import java.util.Arrays;

public class TwoNumberSum {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    System.out.println(Arrays.toString(twoNumberSum(new int[] {4, 6, 1, -3}, 5)));
  }

  public static int[] twoNumberSum1(int[] array, int targetSum) {
    // Write your code here.
    int[] sumArray = new int[2];
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == targetSum) {
          sumArray[0] = array[i];
          sumArray[1] = array[j];
          return sumArray;
        }
      }
    }
    return new int[0];
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    int[] sumArray = new int[2];
    for (int i = 0; i < array.length; i++) {
      if (targetSum - array[i] == array[i]) {
        sumArray[0] = array[i];
        sumArray[1] = array[i];
        return sumArray;
      }
    }
    return new int[0];
  }
}
