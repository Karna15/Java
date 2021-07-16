package DataStructures.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * Queue - First in First Out concept
 * ------
 * Methods
 * 1. add -- add into the stack
 * 2. poll -- removes the top most element and returns the same element
 * 3. Peek -- returns the top most element
 */

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> ref = new ArrayDeque<Integer>();

		ref.add(1);
		ref.add(2);
		ref.add(3);
		ref.add(4);

		System.out.println(ref);
		System.out.println("Size of Queue : " + ref.size());
		System.out.println("Poll operation : " + ref.poll());
		System.out.println(ref);
		System.out.println("Peek operation : " + ref.peek());
		System.out.println(ref);
		System.out.println("Offer operation : " + ref.offer(1)); // returns true when added
		System.out.println(ref);
		System.out.println("Remove operation : " + ref.remove()); // removes the first element and returns it
		System.out.println(ref);
		System.out.println("Element operation : " + ref.element()); // returns the first element, same as peek()
		System.out.println(ref);

	}

}
