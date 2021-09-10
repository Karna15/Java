package Programs.Arrays;

/*
 * Big Bang number is maximum in the row and minimum in the column
 * 
 * {  9, 16, 11 }
 * { 21, 20, 17 }
 * { 10, 19, 15 }
 * 
 * maximum number in the row    => 16, 21, 19
 * minimum number in the column =>  9, 16, 11
 * the unique number is => 16
 */

public class BigBangNumber {

    public static int findBBnumb(int[][] arr) {
	int[] column = new int[arr.length];
	int[] row = new int[arr.length];
	int columnValue = 0;
	int rowValue = 0;

	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr.length; j++) {
		if (columnValue < arr[i][j]) {
		    columnValue = arr[i][j];
		}
		if (j == 0) {
		    rowValue = arr[j][i];
		}
		if (rowValue > arr[j][i]) {
		    rowValue = arr[j][i];
		}
	    }
	    column[i] = columnValue;
	    row[i] = rowValue;
	}

	for (int i = 0; i < column.length; i++) {
	    for (int j = 0; j < row.length; j++) {
		if (column[i] == row[j]) {
		    return column[i];
		}
	    }
	}
	return 0;
    }

    public static void main(String[] args) {
	int[][] arr = { { 9, 16, 11 }, { 21, 20, 17 }, { 10, 19, 15 } };
	System.out.println("Big Bang Number is = " + findBBnumb(arr));
    }

}
