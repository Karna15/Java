package Programs.Strings;

/* 
 * Problem - Palindrome check
 * *****************************
 * Example
 * Input -> "abc" , "123321" , "abcd"
 * if input value and reverse of input value are same then it is a Palindrome String
 * Output-> true , true , false
 */

public class Palindrome {

    // method 1
    private static boolean palindromeCheck1(String ref) {

	for (int i = 0, j = ref.length() - 1; i < j; i++, j--) {
	    if (ref.charAt(i) != ref.charAt(j)) {
		return false;
	    }
	}

	return true;
    }

    // method 2 (using StringBuilder)
    public static boolean palindromeCheck2(String ref) {
	return (ref == null || ref.length() <= 1) || ref.equals(new StringBuilder(ref).reverse().toString());
    }

    public static void main(String[] args) {

	String[] ref = { "abccba", "123321", "abcd" };

	for (String value : ref) {
	    System.out.println("Is Palindrome : " + palindromeCheck1(value));
	}

    }

}
