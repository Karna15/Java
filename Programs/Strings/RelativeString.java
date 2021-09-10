package Programs.Strings;

/*
 * String 1 -> goto
 * String 2 -> togo
 * --
 * By replacing String 2 once we need to get String 1
 */

public class RelativeString {

    public static boolean isSimilarOrNot(String s1, String s2) {

	char[] StringCheck = s2.toCharArray();
	for (int i = 0; i < s2.length() - 1; i++) {
	    for (int j = 1; j < s2.length(); j++) {
		int loop = 0;
		if (s2.equals(s1)) {
		    System.out.println("s1 " + s1 + " s2 " + s2);
		    return true;
		} else {
		    char temp = StringCheck[loop];
		    StringCheck[loop] = StringCheck[j];
		    StringCheck[j] = temp;
		    loop++;
		    s2 = String.valueOf(StringCheck);
		}
	    }
	}
	System.out.println("s1 " + s1 + " s2 " + s2);
	return false;
    }

    public static void main(String[] args) {
	String s1 = "goto";
	String s2 = "togo";
	System.out.println(isSimilarOrNot(s1, s2));
    }

}