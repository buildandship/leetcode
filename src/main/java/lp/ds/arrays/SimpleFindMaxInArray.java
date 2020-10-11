package lp.ds.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

/***
 * Created by praveen on 15/10/19 7:08 PM for learnandpractice
 */
public class SimpleFindMaxInArray {
    public static void main(String[] args) {

        int[] array = {10, 3, 4, 17, 8, 5, 11, 6, 12, 13};
        int[] result = findMaxInArray(array);
        //System.out.println(findMaxInArray(array));
        System.out.println(Arrays.toString(result));
    }

    private static int[] findMaxInArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int[] result = new int[3];
/*        int i=0;
       for(i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        while(i<arr.length){
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
*/
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Diff = " + (max - min));

        result[0] = min;
        result[1] = max;
        result[2] = max - min;
        return result;
    }
}
