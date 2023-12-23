package lp.leetcode.medium.groupanagrams;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
  public static void main(String[] args) {
    System.out.println(
        new GroupAnagrams().groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
    System.out.println(new GroupAnagrams().groupAnagrams(new String[] {""}));
    System.out.println(new GroupAnagrams().groupAnagrams(new String[] {"a"}));
    System.out.println(new GroupAnagrams().groupAnagrams(new String[] {}));
  }

  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) return new ArrayList<>();
    return null;
  }
}
