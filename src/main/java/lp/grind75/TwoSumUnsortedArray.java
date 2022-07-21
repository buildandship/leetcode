package lp.grind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 *<a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public class TwoSumUnsortedArray {
  public static void main(String[] args) {
    int[] array = {3, 2, 4};
    int sum = 6;
    // int[] array = {2, 7, 11, 15};
    // int sum = 9;
    // int[] array = {10, 20, 35, 50, 75, 80};
    // int sum = 130;

    System.out.println(Arrays.toString(twoSum(array, sum)));
  }

  private static int[] twoSum(int[] array, int target) {
    int[] indices = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      int compliment = target - array[i];

      if (map.containsKey(compliment)) {
        indices[0] = i;
        indices[1] = map.get(compliment);
        return indices;
      }
      map.put(array[i], i);
    }
    return indices;
  }
}
