package Programs.Strings;

/*
 * Input String = "abcdeffdfegabcabc"
 * Pattern = "abc"
 * Output = XdeffdfegXX
 */

public class ReplacePattern {

    public static String replacewithX(String input, String pattern) {
	int size = pattern.length();
	int loop = size;
	int i = 0;

	if (input.length() == 1) {
	    return "X";
	}

	while (i < input.length() - loop) {
	    if ((loop + size) == input.length()) {
		break;
	    }
	    if (input.substring(i, i + loop).equals(pattern)) {
		input = input.replaceAll(input.substring(i, i + loop), "X");
	    }
	    i = i + 1;
	}
	return input;
    }

    public static void main(String[] args) {
	String input = "abcdeffdfegabcabc";
	String pattern = "abc";
	System.out.println(replacewithX(input, pattern));
    }

}
