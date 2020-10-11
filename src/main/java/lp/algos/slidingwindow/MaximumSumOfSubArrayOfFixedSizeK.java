package lp.algos.slidingwindow;

/**
 * Find the max sum subarray of a fixed size K
 * <p>
 * Fixed size sliding window
 */
public class MaximumSumOfSubArrayOfFixedSizeK {
  public static void main(String[] args) {
    int array[] = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, k = 3;
    System.out.println(findMaxSumOfSubArrayOfSizeK(array, k));
  }
  
  static int findMaxSumOfSubArrayOfSizeK(int array[], int k) {
    int maxSum = Integer.MIN_VALUE;
    int currentRunningSum = 0;
    for (int i = 0; i < array.length; i++) {
      currentRunningSum += array[i];
      if (i >= (k - 1)) {
        maxSum = Math.max(maxSum, currentRunningSum);
        currentRunningSum -= array[i - (k - 1)];
      }
    }
    return maxSum;
  }
}
