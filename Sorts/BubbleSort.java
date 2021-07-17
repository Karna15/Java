package Sorts;

import java.util.Arrays;

/*
 * Sort - Bubble Sort
 * ------
 *  1. Swaps of two adjacent elements in order to put them in right place
 *  2. Time Complexity -> O(n^2)
 *  3. Time Consumption -> More Time Consumption to run an algorithm.
 */

public class BubbleSort {

	public void Solution(int[] arr) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					isSorted = false;
				}
			}
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = { 4, 5, 9, 8, 2, 1, 3, 6, 7 };
		sort.Solution(arr);
		System.out.println(Arrays.toString(arr));

	}

}
