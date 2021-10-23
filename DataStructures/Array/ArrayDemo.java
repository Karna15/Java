package DataStructures.Array;

/* 
 * Linear -> Static -> Array
 * 
 * Linear Data Structures: 
 * 		In a linear data structure all the elements are arranged in the linear or sequential order. 
 * 		The linear data structure is a single level data structure.
 * Array:
 * 		Array is a static Data Structure
 * 		Arrays are collection of elements of same data type
 * 		It consists of contiguous memory location
 * 		Arrays size needed to be predetermined
 * 	Types of Arrays: 
 * 		Single, Two and Multi-Dimensional arrays
 */

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		System.out.println("One Dimensional Array");
		int ref[] = new int[5];

		ref[0] = 1;
		ref[1] = 3;
		ref[2] = 5;
		ref[3] = 7;
		ref[4] = 9;

		System.out.println(Arrays.toString(ref));

		System.out.println("Two Dimensional Array");
		int ref1[][] = new int[2][3];

		ref1[0][0] = 1;
		ref1[0][1] = 3;
		ref1[0][2] = 5;
		ref1[1][0] = 2;
		ref1[1][1] = 4;
		ref1[1][2] = 6;

		for (int i = 0; i < ref1.length; i++) {
			for (int j = 0; j <= ref1.length; j++) {
				System.out.print(ref1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(ref1));

	}

}
