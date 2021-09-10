package DataStructures.Arrays;

/*
 * Arrays - One and Two Dimensional arrays
 * ------
 * 
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
		System.out.println("Index : " + i + "," + j + " , Value : " + ref1[i][j]);
	    }
	}

    }

}
