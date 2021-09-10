package Programs.Arrays;

public class MaxTripletSum {

    private static int MaxiTripletSum(int[] input) {
	int max1 = 0, max2 = 0, max3 = 0;

	for (int i = 0; i < input.length; i++) {
	    if (input[i] > max1) {
		max3 = max2;
		max2 = max1;
		max1 = input[i];
	    } else if (input[i] > max2) {
		max3 = max2;
		max2 = input[i];
	    } else if (input[i] > max3) {
		max3 = input[i];
	    }
	}

	return max1 + max2 + max3;
    }

    public static void main(String[] args) {

	int[] input = { 1, 3, 5, 2, 8, 8, 10 };
	System.out.println("Maximum Triplet Sum is : " + MaxiTripletSum(input));

    }

}
