package lp.algos.binarysearch;

public class FindFirstOrFindLastUsingBinarySearch {

  public static void main(String[] args) {
    //
    //
    int[] array = {2, 4, 10, 10, 10, 18, 20};
    FindFirstOrFindLastUsingBinarySearch firstOrFindLastUsingBinarySearch =
        new FindFirstOrFindLastUsingBinarySearch();
    System.out.println(firstOrFindLastUsingBinarySearch.findFirstOccurrence(array, 10)); // 2
    // System.out.println(firstOrFindLastUsingBinarySearch.findLastOccurrence(array, 10)); // 4
  }

  int findFirstOccurrence(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    int index = -1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (target == array[mid]) {
        index = mid;
        // right = mid - 1;
      } else if (target < array[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return index;
  }

  int findLastOccurrence(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    int index = -1;
    while (left < right) {
      int mid = left + (right - left) / 2;
    }
    return index;
  }
}
