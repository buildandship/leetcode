package lp.codesignal;

import java.util.*;
import java.util.Map.Entry;

public class TestCodeSignal {

  public static void main(String[] args) {
    // System.out.println(maxProductV1(new int[]{-23, 4, -3, 8, -12}));

    /*   System.out.println(totalNoOfPolygon(1));
        System.out.println(totalNoOfPolygon(2));
        System.out.println(totalNoOfPolygon(3));
        System.out.println(totalNoOfPolygon(4));
        System.out.println(totalNoOfPolygon(5));
    */
    /* System.out.println(makeArrayConsecutive2(new int[] {6, 2, 3, 8}));
    System.out.println(makeArrayConsecutive2(new int[] {0,3}));
    System.out.println(makeArrayConsecutive2(new int[] {5,4,6}));*/

    /* System.out.println(almostIncreasingSequence(new int[]{1,3,2,1}));
    System.out.println(almostIncreasingSequence(new int[]{1,3,2}));
    System.out.println(almostIncreasingSequence(new int[]{1,2,1,2}));*/

    // System.out.println(matrixElementsSum(new int[][] {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3,
    // 3}}));

    // System.out.println(matrixElementsSumV1(new int[][] {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3,
    // 3}}));

    /*    System.out.println(Arrays.toString(allLongestStrings(new String[] {"aba", "aa", "ad", "vcd", "aba"})));
       System.out.println(Arrays.toString(allLongestStrings(new String []{"abc", "eeee", "abcd", "dcd"})));
       System.out.println(Arrays.toString(allLongestStrings(new String []{"a", "abc", "cbd", "zzzzzz", "a",
    "abcdef", "asasa", "aaaaaa"})));
       System.out.println(Arrays.toString(allLongestStrings(new String []{"enyky", "benyky", "yely",
    "varennyky"})));*/

    System.out.println(commonCharacterCount("aabcc","adcaa"));
    System.out.println(commonCharacterCount("zzzz","zzzzzzz"));
    System.out.println(commonCharacterCount("abca","xyzbac"));
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
    int midRow = 2 * n - 1;
    System.out.println(n + "\t" + midRow);
    int total = 0;
    for (int i = 1; i < midRow; i += 2) {
      total += i * 2;
    }
    // System.out.println("total : " + total);
    return midRow + total;
  }

  static int makeArrayConsecutive2(int[] statues) {
    int countAdditional = 0;
    Arrays.sort(statues);
    System.out.println(Arrays.toString(statues));
    for (int i = 1; i < statues.length; i++) {
      if (statues[i] - statues[i - 1] != 1) {
        countAdditional += (statues[i] - statues[i - 1]) - 1;
      }
    }
    return countAdditional;
  }

  static boolean almostIncreasingSequence(int[] sequence) {
    // https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
    // TODO: Revisit this
    int length = sequence.length;
    if (length == 1) {
      return true;
    }
    int count = 0;
    for (int i = 1; i < length && count < 2; ++i) {
      if (sequence[i - 1] >= sequence[i]) {
        ++count;
        if (i > 1 && sequence[i - 2] >= sequence[i]) sequence[i] = sequence[i - 1];
      }
    }
    return count < 2;
  }

  static int matrixElementsSum(int[][] matrix) {
    int cost = 0;

    int previousRow = 0;
    int previousColumn = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (matrix[row - previousRow][col - previousColumn] != 0) {
          System.out.print(matrix[row][col] + ", ");
          cost += matrix[row][col];
        }
        previousColumn++;
      }
      previousRow++;
    }
    System.out.println();
    return cost;
  }

  static int matrixElementsSumV1(int[][] matrix) {
    int sum = 0;
    for (int col = 0; col < matrix[0].length; col++) {
      for (int row = 0; row < matrix.length; row++) {
        if (matrix[row][col] > 0) {
          // System.out.print(matrix[row][col]+", ");
          sum += matrix[row][col];
        } else {
          break;
        }
      }
    }
    return sum;
  }

  static String[] allLongestStrings(String[] inputArray) {
    Map<Integer, String> map = new HashMap<>();
    Map<Integer, List<String>> nmap = new HashMap<>();
    for (int i = 0; i<inputArray.length; i++){
      if(!map.containsKey(inputArray[i].length())){
        map.put(inputArray[i].length(), inputArray[i]);
        List<String> list = new ArrayList<>();
        list.add(inputArray[i]);
        nmap.put(inputArray[i].length(), list);
      }else {
        List<String> strings = nmap.get(inputArray[i].length());
        strings.add(inputArray[i]);
      }
      //System.out.println("Length: "+inputArray[i].length()+"\t "+inputArray[i]);
      //map.put(inputArray[i].length(), inputArray[i]);
      }

    int maxKey = 0;
    for(Entry<Integer, List<String>> keySet: nmap.entrySet()){
      maxKey = Math.max(keySet.getKey(),maxKey);
//      System.out.println(keySet);
    }

    List<String> strings = nmap.get(maxKey);
/*
    System.out.println(map);
    System.out.println(nmap);
    System.out.println("Answer::  "+strings);
*/
    String[] result = strings.stream().toArray(String[]::new);
    return result;
  }

    static int commonCharacterCount(String s1, String s2) {
    // Given two strings, find the number of common characters between them.
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    return 0;
  }
}
