package Programs.Arrays;

import java.util.Arrays;

/* 
 * Problem - Left Rotation of an Array
 * *****************************
 * Example
 * A = [1, 2, 3, 4, 5]
 * Return [2, 3, 4, 5, 1]. --> 1 Rotation
 * Return [3, 4, 5, 1, 2]. --> 2 Rotation
 * Return [4, 5, 1, 2, 3]. --> 3 Rotation
 * Return [5, 1, 2, 3, 4]. --> 4 Rotation
 * Return [1, 2, 3, 4, 5]. --> 5 Rotation
 */

public class LeftRotation {

    private static int[] leftRotationDemo(int[] arr, int d) {

	int size = arr.length;
	int[] result = new int[size];

	for (int oldIndex = 0; oldIndex < size; oldIndex++) {
	    int newIndex = (oldIndex + size - d) % size;
	    result[newIndex] = arr[oldIndex];
	}

	return result;
    }

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3, 4, 5 };
	int rotation = 5;
	int res[] = leftRotationDemo(arr, rotation);
	System.out.println(Arrays.toString(res));

    }

}
