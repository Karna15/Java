package DataStructures.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArrayList {

	public static void main(String[] args) {

		StackArrayList stack = new StackArrayList();

		stack.push(3);
		System.out.println(stack.peek());
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());

	}

	private ArrayList<Integer> stack;

	public StackArrayList() {
		stack = new ArrayList<>();
	}

	public void push(int i) {
		stack.add(i);
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.remove(stack.size() - 1);
	}

	private boolean isEmpty() {
		return stack.isEmpty();
	}

	public int peek() {
		return stack.get(stack.size() - 1);
	}

	public int size() {
		return stack.size();
	}

}
