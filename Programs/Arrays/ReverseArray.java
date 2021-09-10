package Programs.Arrays;

import java.util.Arrays;

/* 
 * Problem - Reverse an given Array
 * *****************************
 * Example
 * A = [1,4,3]
 * Return [3,4,1].
 */

public class ReverseArray {

    private static void reverseDemo(int[] arr) {

	int size = arr.length;
	for (int i = 0; i < size / 2; i++) {
	    int temp = arr[size - i - 1];
	    arr[size - i - 1] = arr[i];
	    arr[i] = temp;
	}

	System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3, 4, 5 };
	reverseDemo(arr);
    }

}
