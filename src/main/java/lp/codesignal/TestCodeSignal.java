package lp.codesignal;

public class TestCodeSignal {

  public static void main(String[] args) {
    // System.out.println(maxProductV1(new int[]{-23, 4, -3, 8, -12}));
    System.out.println(totalNoOfPolygon(1));
    System.out.println(totalNoOfPolygon(2));
    System.out.println(totalNoOfPolygon(3));
    System.out.println(totalNoOfPolygon(4));
    System.out.println(totalNoOfPolygon(5));
  }

  static int maxProductV1(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    int currentMax = 0;
    for (int i = 1; i < inputArray.length; i++) {
      currentMax = inputArray[i - 1] * inputArray[i];
      if (currentMax > max) {
        max = currentMax;
      }
    }
    return max;
  }

  static int totalNoOfPolygon(int n) {
    if (n == 1) return 1;
    int midrow = 2 * n - 1;
    System.out.println(n + "\t" + midrow);

    int total = 0;
    for (int i = midrow; i >= 1; i--) {}

    return total;
  }
}
