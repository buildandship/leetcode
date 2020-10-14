package lp.algos.binarysearch;

public class BinarySearchAlgorithmRecursive {

  public static void main(String[] args) {
    //

    int[] array = {2, 6, 13, 21, 36, 47, 63, 81, 97};
    int targetMid = 36;
    int targetLeft = 6;
    int targetRight = 81;
    int targetAbsent = 45;

    BinarySearchAlgorithmRecursive bsar = new BinarySearchAlgorithmRecursive();
    System.out.println(bsar.binarySearchRecursive(array, 0, array.length - 1, targetMid)); // Pass
    System.out.println(bsar.binarySearchRecursive(array, 0, array.length - 1, targetLeft));
    System.out.println(bsar.binarySearchRecursive(array, 0, array.length - 1, targetRight));
    System.out.println(bsar.binarySearchRecursive(array, 0, array.length - 1, targetAbsent));
  }

  int binarySearchRecursive(int[] array, int left, int right, int target) {

    if (left > right) return -1;
    int mid = left + (right - left) / 2;
    if (target == array[mid]) return mid;
    else if (target < array[mid]) return binarySearchRecursive(array, left, mid - 1, target);
    else return binarySearchRecursive(array, mid + 1, right, target);
  }
}
