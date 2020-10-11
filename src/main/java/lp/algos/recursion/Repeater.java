package lp.algos.recursion;

public class Repeater {
  public static void main(String[] args) {
    System.out.println(Repeater.repeater("g", 5));
  }
  
  static String repeater(String input, int repeat) {
    if (input.length() == repeat) return input;
    input += input;
    return repeater(input, repeat);
  }
}
