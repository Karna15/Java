package Programs.Arrays;

import java.util.Arrays;

/*
 * Sort the elements of an array in the odd index in ascending order and the elements in the even index in descending order. 
 * (Note : Perform the operation in place. i.e, You must only use one array for this operation) 
 * The input consists of ’n’ and followed by ’n’ space separated integers

Example:
Input : 9 
10 7 1 -1 4 -10 6 15 21 

Odd Position Array : {10, 1, 4, 6, 21} ——> { 1, 4, 6, 10, 21} 

Even Position Array : {7, -1, -10, 15} ——-> {15, 7, -1, -10} 

Output : 1 15 4 7 6 -1 10 -10 21
 */

public class SortElement {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 1, -1, 4, -10, 6, 15, 21 };
		sortArray(arr);
	}

	private static void sortArray(int[] arr) {

		for (int i = 0, j = 1; i < (arr.length) && j < (arr.length);) {
			for (int odd = 1, even = 0; odd < (arr.length);) {
				if (odd < arr.length) {
					if (arr[i] < arr[even]) {
						int temp = arr[i];
						arr[i] = arr[even];
						arr[even] = temp;
					}
				}
				if (even < arr.length) {
					if (arr[j] > arr[odd]) {
						int temp = arr[j];
						arr[j] = arr[odd];
						arr[odd] = temp;
					}
				}
				odd = odd + 2;
				even = even + 2;
			}
			i = i + 2;
			j = j + 2;
		}
		System.out.println(Arrays.toString(arr));
	}

}
