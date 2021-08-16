package Programs.Strings;

public class PrintStringDiagonally {

	public static void main(String[] args) {

		String input = "PROGRAM";
		int i, j, end;
		end = input.length() - 1;

		for (i = 0; i <= end; i++) {
			for (j = 0; j <= end; j++) {
				if (i == j || i + j == end) {
					System.out.print(input.charAt(j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
