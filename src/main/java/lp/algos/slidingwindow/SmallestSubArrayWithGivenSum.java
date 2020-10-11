package lp.algos.slidingwindow;

/**
 * Find the smallest sub array with the given sum
 * Dynamic size sliding window
 */
public class SmallestSubArrayWithGivenSum {
  public static void main(String[] args) {
    int arr[] = {4, 2, 2, 7, 8, 1, 2, 8, 10};
    int sum = 8;
    System.out.println(findSmallestSubArray(arr, sum));
  }
  
  static int findSmallestSubArray(int arr[], int sum) {
    int minWindowSize = Integer.MAX_VALUE;
    int windowStart = 0, windowEnd = 0;
    int currentWindowSum = 0;
    for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      currentWindowSum += arr[windowEnd];
      
      while (currentWindowSum >= sum) {
        minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
        currentWindowSum -= arr[windowStart];
        windowStart++;
      }
    }
    return minWindowSize;
  }
}
