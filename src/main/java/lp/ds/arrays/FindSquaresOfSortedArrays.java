package lp.ds.arrays;

import java.util.Arrays;

public class FindSquaresOfSortedArrays {
  public static void main(String[] args) {
    //
    int[] nums1 = {-4, -1, 0, 3, 10};
    int[] nums2 = {-7, -3, 2, 3, 11};
    int[] nums3 = {-3, -2, -1, 4, 5, 6};

    System.out.println(Arrays.toString(sortedSquares(nums1)));
    System.out.println(Arrays.toString(sortedSquares(nums2)));
    System.out.println("###Optimized Solution###");
    System.out.println(Arrays.toString(sortedSquaresUsingTwoPointers(nums1)));
    System.out.println(Arrays.toString(sortedSquaresUsingTwoPointers(nums2)));
    System.out.println(Arrays.toString(sortedSquaresUsingTwoPointers(nums3)));
  }

  static int[] sortedSquares(int[] A) {
    int[] sortedSquareArray = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      sortedSquareArray[i] = (A[i] * A[i]);
    }
    Arrays.sort(sortedSquareArray);
    return sortedSquareArray;
  }

  static int[] sortedSquaresUsingTwoPointers(int[] A) {
    int[] sortedSquareArray = new int[A.length];
    int start = 0;
    int end = A.length - 1;
    int i = end;
    while (start <= end) {
      int negativeSquare = A[start] * A[start];
      int positiveSquare = A[end] * A[end];
      if (negativeSquare > positiveSquare) {
        sortedSquareArray[i--] = negativeSquare;
        start++;
      } else {
        sortedSquareArray[i--] = positiveSquare;
        end--;
      }
      // System.out.println(Arrays.toString(sortedSquareArray));
    }
    return sortedSquareArray;
  }
}
