package lp.ds.arrays;

import java.util.Arrays;

public class FindPairSumPresent {
    public static void main(String[] args) {
        int[] array = {10, 20, 35, 50, 75, 80};
        int sum = 190;

//        System.out.println(" Pair present "+isPairSumNaive(array,sum));
        System.out.println(" Pair present " + isPairSum(array, sum));
        System.out.println("Position " + Arrays.toString(twoSum(array, sum)));

    }

    static boolean isPairSum(int array[], int sum) {
        boolean pairPresent = false;

        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                pairPresent = true;
                break;
            } else if (array[i] + array[j] > sum)
                j--;
            else
                i++;

        }
        return pairPresent;
    }

    static boolean isPairSumNaive(int array[], int sum) {
        boolean pairPresent = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("i = " + array[i]);
                    System.out.println("j = " + array[j]);
                    pairPresent = true;
                    break;
                }
            }
        }
        return pairPresent;
    }

    static int[] twoSum(int[] array, int sum) {
        int[] position = new int[2];

        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                position[0] = i + 1;
                position[1] = j + 1;
                break;
            } else if (array[i] + array[j] > sum)
                j--;
            else
                i++;
        }
        return position;
    }
}
