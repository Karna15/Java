package Programs.Common;

import java.util.Scanner;

public class PrimeCheck {

	private static boolean primeorNot(int numb) {
		for (int i = 2; i <= numb / 2; i++) {
			if (numb % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int numb = sc.nextInt();
		if (primeorNot(numb)) {
			System.out.println(numb + " is a prime number");
		} else {
			System.out.println(numb + " is not a prime number");
		}
	}

}
