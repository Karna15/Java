package Sorts;

import java.util.Arrays;

/*
 * Sort - Quick Sort
 * ------
 *  1. Splits the given array based on pivotal element, and swaps around the element.
 *  2. Time Complexity -> O(n log n)
 *  3. Time Consumption -> Less Time Consumption to run an algorithm.
 */

public class QuickSort {

	public static void QuickSortDemo(int[] arr) {
		Solution(arr, 0, arr.length - 1);
	}

	private static void Solution(int[] arr, int left, int right) {
		
		if (left >= right) {
			return;
		}

		int pivot = arr[(left + right) / 2];
		int index = partition(arr, left, right, pivot);
		Solution(arr, left, index - 1);
		Solution(arr, index, right);
	}

	private static int partition(int[] arr, int left, int right, int pivot) {

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 4, 5, 2, 1 };
		QuickSortDemo(arr);
		System.out.println(Arrays.toString(arr));
	}

}
