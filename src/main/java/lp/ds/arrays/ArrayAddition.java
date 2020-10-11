package lp.ds.arrays;

import java.util.Arrays;

/***
 * Created by mishrpf on 19-Jun-19 6:49 AM for learnandpractice
 *
 * Given two numbers in form of array add them
 */
public class ArrayAddition {

	public static void main(String[] args) {
/*
		int arr1[] = {9, 9, 9, 9, 9, 9, 9};
		int arr2[] = {1, 6, 8, 2, 6, 7};
*/
        int[] arr1 = {9};
        int[] arr2 = {1};
		ArrayAddition aa = new ArrayAddition();
        int[] result = aa.add(arr1, arr2);

		System.out.println(Arrays.toString(result));
	}

    public int[] add(int[] arr1, int[] arr2) {
        int[] result = new int[Math.max(arr1.length, arr2.length) + 1];
		int l1 = arr1.length;
		int l2 = arr2.length;

		int i = arr1.length, j = arr2.length, k=result.length;
		int sum =0,carry=0;
		while (i >= arr1.length || j>=arr2.length) {
			sum=arr1[i]+arr2[j];
			if(sum>9){
				carry=sum%10;
				sum=sum/10;
			}
			result[result.length-1]=sum+carry;
			i--;
			j--;
		}

		return result;
	}
}
