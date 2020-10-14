package lp.algos.binarysearch;

public class BinarySearchAlgorithmIterative {

  public static void main(String[] args) {
    int[] array = {2, 6, 13, 21, 36, 47, 63, 81, 97};
    int targetMid = 36;
    int targetLeft = 6;
    int targetRight = 81;
    int targetAbsent = 45;

    BinarySearchAlgorithmIterative bsa = new BinarySearchAlgorithmIterative();
    // System.out.println(bsa.binarySearchAlgorithm(array,targetMid));// Pass
    // System.out.println(bsa.binarySearchAlgorithm(array,targetLeft));
    System.out.println(bsa.binarySearchAlgorithm(array, targetRight));
    // System.out.println(bsa.binarySearchAlgorithm(array,targetLeft));
  }

  int binarySearchAlgorithm(int[] array, int target) {

    int left = 0;
    int right = array.length - 1;
    int mid = 0;
    while (left <= right) {
      // mid = (left+right)/2;
      mid = left + (right - left) / 2; // better approach
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else if (array[mid] < target) {
        left = mid + 1;
      }
    }
    return -1;
  }
}
