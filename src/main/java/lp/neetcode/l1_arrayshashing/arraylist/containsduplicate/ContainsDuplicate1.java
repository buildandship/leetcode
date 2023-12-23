package lp.neetcode.l1_arrayshashing.arraylist.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate1 {

  public static void main(String[] args) {
    System.out.println(new ContainsDuplicate1().containsDuplicate(new int[] {1, 2, 3, 1})); // true
    System.out.println(new ContainsDuplicate1().containsDuplicate(new int[] {1, 2, 3, 4})); // false
    System.out.println(
        new ContainsDuplicate1()
            .containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true

    System.out.println(
        new ContainsDuplicate1()
            .containsDuplicateWithoutAdditionalSpace(new int[] {1, 2, 3, 1})); // true
    System.out.println(
        new ContainsDuplicate1()
            .containsDuplicateWithoutAdditionalSpace(new int[] {1, 2, 3, 4})); // false
    System.out.println(
        new ContainsDuplicate1()
            .containsDuplicateWithoutAdditionalSpace(
                new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
  }

  // Approach one using hashset TC O(n) SC O(n)
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums) {
      if (set.contains(i)) {
        return true;
      } else {
        set.add(i);
      }
    }
    return false;
  }

  // Approach without using set one using hashset TC O(n logn) SC O(1)
  public boolean containsDuplicateWithoutAdditionalSpace(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] == nums[i]) {
        return true;
      }
    }
    return false;
  }

  // Approach using XoR
}
