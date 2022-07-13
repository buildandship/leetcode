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
    if (len == 0) return;
    for (int i = 0; i < len; i++) {
      if (arr[i] == 0) {
        // shift all elements to right from end
        for (int j = len - 1; j > i; j--) {
          arr[j] = arr[j - 1];
          System.out.println("Inner Loop :: " + Arrays.toString(arr));
        }
        i++;
      }
      System.out.println("\nOuter loop :: " + Arrays.toString(arr));
    }
    System.out.println("\t\tFinal Output array :: " + Arrays.toString(arr));
  }
}
