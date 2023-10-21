package lp.ds.strings;

/**
 *  https://leetcode.com/problems/string-without-aaa-or-bbb
 */

public class StringWithOut3A3B3C {
  public static void main(String[] args){
    System.out.println(strWithout3a3b(1,2));
    System.out.println(strWithout3a3b(4,1));
  }
  public static String strWithout3a3b(int A, int B) {
    StringBuilder ans = new StringBuilder();
    
    while (A > 0 || B > 0) {
      boolean writeA = false;
      int L = ans.length();
      if (L >= 2 && ans.charAt(L-1) == ans.charAt(L-2)) {
        if (ans.charAt(L-1) == 'b')
          writeA = true;
      } else {
        if (A >= B)
          writeA = true;
      }
      
      if (writeA) {
        A--;
        ans.append('a');
      } else {
        B--;
        ans.append('b');
      }
    }
    return ans.toString();
  }
  
}
