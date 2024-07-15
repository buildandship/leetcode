package lp.algos.binarysearch;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
class BinarySearchAlgorithmTest {

  @Test
  void testBinarySearchTargetPresent() {
    BinarySearchAlgorithmIterative bsa = new BinarySearchAlgorithmIterative();
    int expected = 2;
    int actual = bsa.binarySearchAlgorithm(new int[] {2, 6, 13, 21, 36, 47, 63, 81, 97}, 3);
    assertEquals(expected, actual, "This method is used to test the binary test");
  }

  @Test
  void testBinarySearchAbsent() {
    BinarySearchAlgorithmIterative bsa = new BinarySearchAlgorithmIterative();
    int expected = 2;
    int actual = bsa.binarySearchAlgorithm(new int[] {2, 6, 13, 21, 36, 47, 63, 81, 97}, 3);
    assertEquals(expected, actual, "This method is used to test the binary test");
  }

  @Test
  void testBinarySearch() {
    BinarySearchAlgorithmIterative bsa = new BinarySearchAlgorithmIterative();
    int expected = 2;
    int actual = bsa.binarySearchAlgorithm(new int[] {2, 6, 13, 21, 36, 47, 63, 81, 97}, 3);
    assertEquals(expected, actual, "This method is used to test the binary test");
  }
}
