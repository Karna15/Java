package DataStructures.Stack;

import java.util.Stack;

/*
 * Stack - Last in First Out concept
 * ------
 * Methods
 * 1. Push -- add into the stack
 * 2. Pop -- removes the top most element and returns the same element
 * 3. Peek -- returns the top most element
 * 4. search -- checks whether element presents or not and returns 1 or -1
 * 5. empty -- Tests if this stack is empty and returns true or false
 */

public class StackDemo {

    public static void main(String[] args) {

	Stack<String> ref = new Stack<String>();

	System.out.println(ref.size());
	ref.push("Alex");
	ref.push("Fred");
	System.out.println(ref.size());
	System.out.println(ref);
	ref.push("James");
	System.out.println(ref.pop());
	System.out.println(ref);
	System.out.println(ref.peek());
	System.out.println(ref.search("Fredi"));
	System.out.println(ref.empty());

    }

}
