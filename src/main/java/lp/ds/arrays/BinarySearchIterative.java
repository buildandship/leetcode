package lp.ds.arrays;

/**
 * Created by praveen on 21/01/20 10:00 PM for learnandpractice
 */
public class BinarySearchIterative {

  public static void main(String[] args) {
    //
    int[] arr = {2, 3, 4, 10, 40};
    // int num = 10;
    int num = 11;

    int result = binarySearchIterative(arr, num);
    if (result == -1) {
      System.out.println("Element not present");
    } else {
      System.out.println("Element found at " + "index " + result);
    }
  }

  static int binarySearchIterative(int[] arr, int num) {

    int start = 0, end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - 1) / 2;
      // Middle element
      if (num == arr[mid]) {
        return mid;
      }
      // if num greater than middle element move start to middle+1
      if (num > arr[mid]) {
        start = mid + 1;
      }
      // if num less than middle element move end to middle-1
      if (num < arr[mid]) {
        end = mid + 1;
      }
    }
    return -1;
  }
}
