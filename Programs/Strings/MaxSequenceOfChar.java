package Programs.Strings;

public class MaxSequenceOfChar {

    public static String longestSequenceOfChar(String str) {
	String result = "";

	for (int i = 0; i < str.length(); i++) {
	    int j = i;
	    while (j < str.length() && str.charAt(j) == str.charAt(i)) {
		j++;
	    }

	    if (j - i > result.length()) {
		result = str.substring(i, j);
	    }
	}
	return result;
    }

    public static void main(String[] args) {
	String input = "aabbccc";
	System.out.println(longestSequenceOfChar(input));
    }

}
