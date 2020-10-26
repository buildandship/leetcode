package lp.ds.arrays;

import java.util.Arrays;

public class DuplicateZerosInAnArray {
  public static void main(String[] args) {
    int[] nums1 = {1, 0, 2, 3, 0, 4, 5, 0};
    int[] nums2 = {1, 2, 3};
    duplicateZeros(nums1);
    duplicateZeros(nums2);
  }

  static void duplicateZeros(int[] arr) {
    System.out.println("Input array:: " + Arrays.toString(arr));
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
      if (arr[i] == 0) {
        arr[i++] = 0;
      } else {

      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
