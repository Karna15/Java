package Programs.Arrays;

public class MoveZerostoEnd {

    private static void moveZerostoEnd(int[] input) {
	int count = 0;
	for (int i = 0; i < input.length; i++) {
	    if (input[i] != 0) {
		input[count++] = input[i];
	    }
	}
	while (count < input.length) {
	    input[count++] = 0;
	}
	for (int j = 0; j < input.length; j++) {
	    System.out.print(input[j] + " ");
	}
    }

    public static void main(String[] args) {

	int[] input = { 1, 0, 3, 0, 1, 0, 6 };
	moveZerostoEnd(input);

    }

}
