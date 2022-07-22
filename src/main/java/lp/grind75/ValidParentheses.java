package lp.grind75;

import java.util.Stack;

/***
 *<a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class ValidParentheses {
  public static void main(String[] args) {

    System.out.println(isValid("()"));
    System.out.println(isValid("()[]{}"));
    System.out.println(isValid("(]"));
    System.out.println(isValid("([)]"));
    System.out.println(isValid("{[]}"));
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    char[] chars = s.toCharArray();

    for (char aChar : chars) {
      if (aChar == '(' || aChar == '[' || aChar == '{') {
        stack.push(aChar);
      } else if (aChar == ')' && stack.peek() == '(' && !stack.isEmpty()) {
        stack.pop();
      } else if (aChar == ']' && stack.peek() == '[' && !stack.isEmpty()) {
        stack.pop();
      } else if (aChar == '}' && stack.peek() == '{' && !stack.isEmpty()) {
        stack.pop();
      } else {
        return false;
      }
    }
    return stack.isEmpty();
  }

  /*
  public static boolean isValid(String s) {

    if (s.length() % 2 != 0) return false;

    Stack<Character> stack = new Stack<>();
    char[] chars = s.toCharArray();

    for (char aChar : chars) {
      if (aChar == '(') {
        stack.push(')');
      } else if (aChar == '[') {
        stack.push(']');
      } else if (aChar == '{') {
        stack.push('}');
      } else if (stack.isEmpty() || stack.pop() != aChar) {
        return false;
      }
    }

    return stack.isEmpty();
  }
   */
}
