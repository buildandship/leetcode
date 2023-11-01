package lp.codesignal;

import java.lang.reflect.Array;
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

    /*   System.out.println(commonCharacterCount("aabcc","adcaa"));
    System.out.println(commonCharacterCount("zzzz","zzzzzzz"));
    System.out.println(commonCharacterCount("abca","xyzbac"));*/

    /*    System.out.println(isLucky(1230));
    System.out.println(isLucky(239017));
    System.out.println(isLucky(134008));*/

    /*    System.out.println(Arrays.toString(sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));
    System.out.println(Arrays.toString(sortByHeight(new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3})));
    System.out.println(Arrays.toString(sortByHeight(new int[]{-1, -1, -1, -1, -1})));*/

    System.out.println(reverseInParentheses("(bar)")); // rab
    System.out.println(reverseInParentheses("foo(bar)baz")); // foorabbaz
    System.out.println(reverseInParentheses("foo(bar)baz(blim)")); // foorabbazmilb
    System.out.println(reverseInParentheses("foo(bar(baz))blim")); // foobazrabblim
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
    /* char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    //brute force O(nxn)
    int commonCount=0;
    for(int i=0; i<c1.length; i++){
      for(int j=0; j<c2.length; j++){
        if(c1[i]==c2[j]){
          commonCount++;
          c1[i]=' ';
          c2[j]=' ';
          break;
        }
      }
    }
    return commonCount;*/

    int[] s1array = new int[26];
    int[] s2array = new int[26];

    for (char c : s1.toCharArray()) {
      s1array[c - 'a']++;
    }
    for (char c : s2.toCharArray()) {
      s2array[c - 'a']++;
    }
    int count = 0;
    for (int i = 0; i < 26; i++) {
      count += Math.min(s1array[i], s2array[i]);
    }
    return count;
  }

  static boolean isLucky(int n) {
    String ticketNumber = String.valueOf(n);
    int sumLeft = 0;
    int sumRight = 0;
    if (ticketNumber.length() % 2 != 0) {
      return false;
    } else {
      char[] nums = ticketNumber.toCharArray();
      for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
        sumLeft += nums[i];
        sumRight += nums[j];
      }
      return sumLeft == sumRight;
    }
  }

  static int[] sortByHeight(int[] a) {
    if (a != null && a.length != 0 && a.length != 1) {

      int left = 0;
      int right = a.length - 1;

      while (left < right) {
        if (a[left] == -1) {
          left++;
        } else if (a[right] == -1) {
          right--;
        } else {
          insertionSort(a, left, right);
          left++;
          // right--;MISTAKE
        }
      }
    }
    return a;
  }

  private static void insertionSort(int[] a, int left, int right) {
    for (int index = right; index >= left; index--) {
      if (a[index] != -1 && a[index] < a[left]) {
        swap(a, index, left);
      }
    }
  }

  private static void swap(int[] a, int left, int right) {
    int temp = a[left];
    a[left] = a[right];
    a[right] = temp;
  }

  static String reverseInParentheses(String inputString) {
    /**
     * 1. Find last parenths "(" -> firstIndex 2. Find the next parenths ")", after firstIndex ->
     * lastIndex 3. Reverse the String between firstIndex and lastIndex 4. Recreate the inputString
     * with 1. First part => word from begin to firstIndex 2. Reverse part => String a step 3 3.
     * Last part => word from lastIndex to end 5.Repeat steps 1 to 4 until there are no parenths
     * left
     */
    int firstIndex = inputString.lastIndexOf("(");
    int lastIndex = inputString.indexOf(")", firstIndex);
    while (firstIndex != -1) {
      String reverse =
          new StringBuilder(inputString.substring(firstIndex + 1, lastIndex)).reverse().toString();
      String firstPart = inputString.substring(0, firstIndex);
      String lastPart = inputString.substring(lastIndex + 1);
      inputString = firstPart + reverse + lastPart;
      firstIndex = inputString.lastIndexOf("(");
      lastIndex = inputString.indexOf(")", firstIndex);
    }
    return inputString;
  }
}
