package lp.approaches.kadane;

/***
 *<a href="https://leetcode.com/problems/maximum-subarray/">Maximum Sum Sub Array</a>
 */
public class MaximumSumSubArray {
  public static void main(String[] args) {
    //
    int[] array = {-2, 2, 5, -11, 6};
    System.out.println(maxSubArray(array));
    int[] array1 = {7, 1, 5, 3, 6, 4};
    System.out.println(maxSubArray(array1));
    int[] array2 = {7, 6, 4, 3, 1};
    System.out.println(maxSubArray(array2));
    int[] array3 = {2};
    System.out.println(maxSubArray(array3));
  }

  public static int maxSubArray(int[] nums) {
    int maxSum = 0;
    int currentMaxSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      currentMaxSum = Math.max(currentMaxSum, (nums[i] + nums[i - 1]));
      maxSum = Math.max(maxSum, currentMaxSum);
    }
    return maxSum;
  }
}
