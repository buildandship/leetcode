package lp.codesignal;

public class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("zzzazzazz"));
    System.out.println(isPalindrome("aabac"));
    System.out.println(isPalindrome("aabaa"));
    System.out.println(isPalindrome("aabdbaa"));
  }

  static boolean isPalindrome(String inputString) {
    int len = inputString.length();
    boolean palindrome = true;
    if (len == 1) {
      return true;
    } else {
      for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
        if (inputString.charAt(i) != inputString.charAt(j)) {
          palindrome = false;
          break;
        }
      }
    }
    return palindrome;
  }
}
