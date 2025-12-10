package lab20;

public class StackTester {
	public static void main(String[] args) {
		long pretime = System.currentTimeMillis();
		Stack stack1 = new Stack();
		System.out.println(stack1);
		stack1.push(5);
		System.out.println(stack1);
		stack1.push(7);
		System.out.println(stack1);
		System.out.println(stack1.peek());
		System.out.println(stack1.size());
		stack1.pop();
		System.out.println(stack1);
		System.out.println(stack1.isEmpty());
		System.out.println(stack1.pop());
		System.out.println(stack1);
		System.out.println(stack1.isEmpty());
		System.out.println("Basic Stack Test: " + (System.currentTimeMillis() - pretime) + "ms");
	}
}
