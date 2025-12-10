package lab20;

import java.util.EmptyStackException;

/**
 * A stack designed to contain integers
 * <p>
 * This class represents a stack of objects, following a Last-In First-Out (LIFO), meaning the latest items added are the first ones removed. It has methods for adding and removing things from the stack.
 * <p>
 * Relatively fast, runs a basic tester in around 10ms.
 * </p>
 * @author Liam Salg
 */
public class Stack {
	private Integer[] stack;
	
	/**
     * Constructs an empty stack
     */
	public Stack() {
		stack = new Integer[0];
	}
	
	/**
     * Adds an integer to the top of the stack.
     *
     * @param e Integer to add to the stack.
     */
	public void push(int e) {
		Integer[] stack2 = new Integer[stack.length + 1];
		System.arraycopy(stack, 0, stack2, 0, stack.length);
		stack2[stack2.length - 1] = e;
		stack = stack2;
	}
	
	/**
     * Removes and returns the top value of the stack.
     *
     * @return The top value of the stack
     */
	public int pop() throws EmptyStackException {
		if (isEmpty()) {throw new EmptyStackException();}
		int temp = stack[stack.length - 1];
		Integer[] stack2 = new Integer[stack.length - 1];
		System.arraycopy(stack, 0, stack2, 0, stack2.length);
		stack = stack2;
		return temp;
	}
	
	/**
     * Returns the top value of the stack, without removing it.
     *
     * @return The top value of the stack
     */
	public int peek() throws EmptyStackException {
		if (isEmpty()) {throw new EmptyStackException();}
		return stack[stack.length - 1];
	}
	
	/**
     * Returns the size of the stack.
     *
     * @return The size of the stack.
     */
	public int size() {
		return stack.length;
	}
	
	/**
     * Returns true if the stack has no values in it, false otherwise.
     *
     * @return Is the stack empty
     */
	public boolean isEmpty() {
		return stack.length == 0;
	}
	
	/**
     * Returns a string representation of the stack.
     *
     * @return String representation of the stack
     */
	public String toString() {
		String str = "Stack[";
		for (int i : stack) {
			str += i + ",";
		}
		if (str.substring(str.length() - 1).equals(",")) {
			str = str.substring(0, str.length() - 1);
		}
		return str + "]";
	}
}
