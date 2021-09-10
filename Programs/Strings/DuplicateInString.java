package Programs.Strings;

/*
 * First Occurring Duplicate
 */

public class DuplicateInString {

    public static void main(String[] args) {
	String name = "abcdd";
	System.out.print(" - " + DeleteString(name));
    }

    private static int DeleteString(String name) {

	int count = 1;
	for (int i = 0; i < name.length(); i++) {
	    if (i + 1 == name.length()) {
		return count;
	    } else {
		if (name.substring(i, i + 1).equals(name.substring(i + 1, i + 2))) {
		    System.out.print(name.substring(i, i + 1));
		    count++;
		}
	    }
	}
	return count;
    }
}
