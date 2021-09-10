package Programs.Strings;

/* 
 * Problem - First Letter in a Strings to Upper case
 * *****************************
 * Example
 * Input -> alex is from france
 * Output-> Alex Is From France
 */

public class StringInitToUpperCase {

    public static String initCap(String ref) {

	String output = "";

	for (int i = 0; i < ref.length(); i++) {

	    String ref1, ref2 = " ";
	    if (ref.substring(i, i + 1).equals(" ")) {
		ref1 = ref.substring(i + 1, i + 2);
		ref2 = ref.substring(i + 2, ref.length());
		output = output.replace(ref1 + ref2, ref1.toUpperCase() + ref2) + ref1.toUpperCase() + ref2;
	    }

	    if (i == 0) {
		ref1 = ref.substring(0, 1);
		ref2 = ref.substring(1, ref.length());
		output = output + ref1.toUpperCase() + ref2;
	    }
	}
	output = output.substring(0, ref.length());
	return output;
    }

    public static void main(String[] args) {

	String ref = "alex is from france";
	System.out.println(initCap(ref));

    }

}
