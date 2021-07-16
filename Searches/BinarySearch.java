package Searches;

public class BinarySearch {
	
	private static boolean binarySearchRecursion(int[] arr, int find, int left, int right) {
		
		if (left > right) {
			return false;
		}

		int mid = left + ((right - left) / 2);
		
		if (arr[mid] == find) {
			return true;
		} else if (find < arr[mid]) {
			return binarySearchRecursion(arr, find, left, mid - 1);
		} else {
			return binarySearchRecursion(arr, find, mid + 1, right);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 19, 21, 22, 26, 30, 40, 50 };
		int find = 20;
		System.out.println(binarySearchRecursion(arr, find, 0 , arr.length));
	}

}
