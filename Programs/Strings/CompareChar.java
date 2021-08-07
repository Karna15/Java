package Programs.Strings;

public class CompareChar {

	public static void main(String[] args) {
		
		char first = 'a';
		char second = 'b';
		
		int comp = Character.compare(second, first);
		
		// if greater, than output is 1
		// if lesser, than output is -1
		
		System.out.println(comp);

	}

}
