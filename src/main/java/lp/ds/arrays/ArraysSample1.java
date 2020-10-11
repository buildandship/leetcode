package lp.ds.arrays;

import java.util.Arrays;

/***
 * Created by mishrpf on 18-Jun-19 1:25 PM for learnandpractice
 *
 */
public class ArraysSample1 {
    /**
     * I/P array a[]={5,8,1,4,2,9,3,7,6}
     * O/P array b[]={1,9,2,8,3,7,4,6,5}
     */
    public static void main(String[] args) {
        //int a[]={5,8,1,4,2,9,3,7,6};
        int[] a = {5, 8, 1, 4, 2, 9, 3, 7, 6, 10, 14, 11, 13, 12, 15};

        //solution1(a);
        System.out.println(Arrays.toString(alternateSort(a)));
    }


    public static int[] solution1(int[] a) {
        int[] b = new int[a.length];
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int i = 0, j = a.length - 1, k = 0, l = 1;
        while (i < j) {
            System.out.print(a[i]);
            System.out.print(",");
            System.out.print(a[j]);
            System.out.print(",");
            b[k] = a[i];
            b[l] = a[j];
            i++;
            j--;
            k = k + 2;
            l = l + 2;
        }

        if (a.length % 2 == 1) {
            System.out.print(a[i]);
            b[k] = a[i];
        }

/*
		for(int i=0,j=a.length-1; i<a.length/2;i++,j--){
			System.out.print(a[i]);
			System.out.print("," );
			System.out.print(a[j]);
			System.out.print("," );
			}
*/
        System.out.println();
        System.out.println(Arrays.toString(b));
        return b;
    }

    public static int[] alternateSort(int[] a) {
        Arrays.sort(a);
        for (int i = 1; i < a.length - 1; i += 2) {
            swap(a, i, i + 1);
        }
        return a;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
