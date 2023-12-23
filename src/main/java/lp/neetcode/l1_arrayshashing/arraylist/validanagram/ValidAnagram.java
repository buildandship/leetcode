package lp.neetcode.l1_arrayshashing.arraylist.validanagram;

import java.util.Arrays;

public class ValidAnagram {
  public static void main(String[] args) {
    /* System.out.println(new ValidAnagram().isAnagram("anagram","nagaram"));//true
    System.out.println(new ValidAnagram().isAnagram("rat","car"));//false
    System.out.println(new ValidAnagram().isAnagram("malayalam","mmaaaally"));//true*/

    System.out.println(new ValidAnagram().isAnagramSingleGo("anagram", "nagaram")); // true
    System.out.println(new ValidAnagram().isAnagramSingleGo("ratx", "cary")); // false
    System.out.println(new ValidAnagram().isAnagramSingleGo("malayalam", "Mmaaaally")); // true
  }

  // Approach 1: TC O(n logn) SC O(n)
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    } else {
      char[] sa = s.toLowerCase().toCharArray();
      char[] ta = t.toLowerCase().toCharArray();
      Arrays.sort(sa);
      Arrays.sort(ta);

      for (int i = 0; i < sa.length; i++) {
        if (sa[i] != ta[i]) {
          System.out.println(" s: " + sa[i] + "\t t: " + ta[i]);
          return false;
        }
      }
      return true;
    }
  }

  public boolean isAnagramSingleGo(String s, String t) {
    s = s.toLowerCase();
    t = t.toLowerCase();
    if (s.length() != t.length()) {
      return false;
    } else {
      int[] alphabet = new int[26];
      for (int i = 0; i < s.length(); i++) {
        alphabet[s.charAt(i) - 'a']++;
      }
      for (int i = 0; i < t.length(); i++) {
        alphabet[t.charAt(i) - 'a']--;
      }
      System.out.println(Arrays.toString(alphabet));
      for (int i : alphabet) {
        if (i != 0) {
          return false;
        }
      }
      return true;
    }
  }
}
