package Programs.Strings;

/* 
 * Problem - Reverse the given String
 * *****************************
 * Example
 * Input -> "123abc"
 * Output-> "cba321"
 */

public class StringReverse {

    // method 1
    private static String reverseDemo1(String ref) {

	if (ref == null || ref.isEmpty()) {
	    return ref;
	}

	char[] value = ref.toCharArray();
	for (int i = 0, j = ref.length() - 1; i < j; i++, j--) {
	    char temp = value[i];
	    value[i] = value[j];
	    value[j] = temp;
	}

	return new String(value);
    }

    // method 2 (using StringBuilder)
    public static StringBuilder reverseDemo2(String ref) {
	return new StringBuilder(ref).reverse();
    }

    public static void main(String[] args) {

	String ref = "123abc";
	System.out.println(reverseDemo1(ref));
	System.out.println(reverseDemo2(ref));

    }

}
