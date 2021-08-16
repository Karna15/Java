package Programs.Strings;

public class MaxFrequencyofChar {

	private static void MaxiFrequencyofChar(String input) {
		int count[] = new int[256];

		for (int i = 0; i < input.length(); i++) {
			count[input.charAt(i)]++;
		}
		int max = -1;
		char maxChar = ' ';

		for (int i = 0; i < input.length(); i++) {
			if (max < count[input.charAt(i)]) {
				max = count[input.charAt(i)];
				maxChar = input.charAt(i);
			}
		}
		System.out.println("Max occuring character is : " + maxChar + " and count is : " + max);
	}

	public static void main(String[] args) {

		String input = "abaca";
		MaxiFrequencyofChar(input);

	}
}
