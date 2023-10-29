package lp.codesignal;

import java.util.*;

public class TestCodeSignal {

  public static void main(String[] args) {
    // System.out.println(maxProductV1(new int[]{-23, 4, -3, 8, -12}));

    /*   System.out.println(totalNoOfPolygon(1));
        System.out.println(totalNoOfPolygon(2));
        System.out.println(totalNoOfPolygon(3));
        System.out.println(totalNoOfPolygon(4));
        System.out.println(totalNoOfPolygon(5));
    */
    /* System.out.println(makeArrayConsecutive2(new int[] {6, 2, 3, 8}));
    System.out.println(makeArrayConsecutive2(new int[] {0,3}));
    System.out.println(makeArrayConsecutive2(new int[] {5,4,6}));*/

    /* System.out.println(almostIncreasingSequence(new int[]{1,3,2,1}));
    System.out.println(almostIncreasingSequence(new int[]{1,3,2}));
    System.out.println(almostIncreasingSequence(new int[]{1,2,1,2}));*/

    // System.out.println(matrixElementsSum(new int[][] {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3,
    // 3}}));

    // System.out.println(matrixElementsSumV1(new int[][] {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3,
    // 3}}));

    System.out.println(allLongestStrings(new String[] {"aba", "aa", "ad", "vcd", "aba"}));
    //    System.out.println(allLongestStrings(new String []{"abc", "eeee", "abcd", "dcd"}));
    //    System.out.println(allLongestStrings(new String []{"a", "abc", "cbd", "zzzzzz", "a",
    // "abcdef", "asasa", "aaaaaa"}));
    //    System.out.println(allLongestStrings(new String []{"enyky", "benyky", "yely",
    // "varennyky"}));
  }

  static int maxProductV1(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    int currentMax = 0;
    for (int i = 1; i < inputArray.length; i++) {
      currentMax = inputArray[i - 1] * inputArray[i];
      if (currentMax > max) {
        max = currentMax;
      }
    }
    return max;
  }

  static int totalNoOfPolygon(int n) {
    if (n == 1) return 1;
    int midRow = 2 * n - 1;
    System.out.println(n + "\t" + midRow);
    int total = 0;
    for (int i = 1; i < midRow; i += 2) {
      total += i * 2;
    }
    // System.out.println("total : " + total);
    return midRow + total;
  }

  static int makeArrayConsecutive2(int[] statues) {
    int countAdditional = 0;
    Arrays.sort(statues);
    System.out.println(Arrays.toString(statues));
    for (int i = 1; i < statues.length; i++) {
      if (statues[i] - statues[i - 1] != 1) {
        countAdditional += (statues[i] - statues[i - 1]) - 1;
      }
    }
    return countAdditional;
  }

  static boolean almostIncreasingSequence(int[] sequence) {
    // https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
    // TODO: Revisit this
    int length = sequence.length;
    if (length == 1) {
      return true;
    }
    int count = 0;
    for (int i = 1; i < length && count < 2; ++i) {
      if (sequence[i - 1] >= sequence[i]) {
        ++count;
        if (i > 1 && sequence[i - 2] >= sequence[i]) sequence[i] = sequence[i - 1];
      }
    }
    return count < 2;
  }

  static int matrixElementsSum(int[][] matrix) {
    int cost = 0;

    int previousRow = 0;
    int previousColumn = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (matrix[row - previousRow][col - previousColumn] != 0) {
          System.out.print(matrix[row][col] + ", ");
          cost += matrix[row][col];
        }
        previousColumn++;
      }
      previousRow++;
    }
    System.out.println();
    return cost;
  }

  static int matrixElementsSumV1(int[][] matrix) {
    int sum = 0;
    for (int col = 0; col < matrix[0].length; col++) {
      for (int row = 0; row < matrix.length; row++) {
        if (matrix[row][col] > 0) {
          // System.out.print(matrix[row][col]+", ");
          sum += matrix[row][col];
        } else {
          break;
        }
      }
    }
    return sum;
  }

  static String[] allLongestStrings(String[] inputArray) {
    return new String[] {"1"};
  }
}
