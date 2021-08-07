package Programs.Strings;

public class SortStrings {

	public static void main(String[] args) {

		String names[] = { "Alex", "Zidane", "Bale", "James" };
		String temp;
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareToIgnoreCase(names[i]) < 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					count++;
				}
			}
			System.out.println(names[i]);
		}
		System.out.println("Total swaps = " + count);
	}

}
