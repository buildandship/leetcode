package lp.ds.strings;

public class PracticeString {
  public static void main(String[] args) {
    String s = "Hello World";

    System.out.println(s.indexOf('o'));
    System.out.println(s.lastIndexOf('o'));

    System.out.println(s.substring(s.indexOf('o'), s.lastIndexOf('o')));
    System.out.println(s.substring(s.lastIndexOf('o')));
  }
}
