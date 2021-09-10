package Programs.Common;

public class ASCII {

    public static void main(String[] args) {

	System.out.println((int) 'a'); // ASCII values of characters
	System.out.println((int) 'z');
	System.out.println((int) 'A');
	System.out.println((int) 'Z');
	System.out.println((int) '0');
	System.out.println((int) '9');

	System.out.println((char) 97); // character based on ASCII values

	System.out.println((char) ((int) 'a' - 32)); // lower to upper case conversion
	System.out.println((char) ((int) 'A' + 32)); // upper to lower case conversion

    }

}
