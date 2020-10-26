package lp.ds.arrays;

/** Given a binary array, find the maximum number of consecutive 1s in this array. */
public class FindMaxConsecutiveOnes {
  public static void main(String[] args) {
    System.out.println("#####################################");
    var array11 = new int[] {1, 0, 1, 1, 1, 0, 0, 1, 1};
    System.out.println(findMaxConsecutiveNumberCount(array11, 1));
    var array22 = new int[] {1, 0, 1, 1, 1, 1, 1, 1, 1};
    System.out.println(findMaxConsecutiveNumberCount(array22, 1));
    var array33 = new int[] {1, 0, 1, 0, 0, 0, 0, 1, 1};
    System.out.println(findMaxConsecutiveNumberCount(array33, 1));
  }

  static int findMaxConsecutiveNumberCount(int[] array, int num) {
    int maxConsecutiveNumberCount = 0;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == num) {
        count++;
      } else {
        count = 0;
      }
      maxConsecutiveNumberCount = Math.max(maxConsecutiveNumberCount, count);
    }
    return maxConsecutiveNumberCount;
  }
}
