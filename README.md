# Stacks and Queues

## Objective

- Implement a stack and queue class using an array of integer values. 
- Program in teams of two, where one person completes `Stack` and the other completes `Queue`.

## Project Details

- Create a class `Stack` which implements a simple stack using an array of integer values and contains the following methods.
	- `void push(int element)`: push element onto the top of the stack
	- `int pop()`: removes and returns the top of the stack. Throws EmptyStackException if the stack is empty.
	- `int peek()`: returns, but does not remove, the top of the stack. Throws EmptyStackException if the stack is empty.
	- `int size()`: returns the number of elements in the queue.
	- `bool isEmpty()`: returns true if there are no elements in the stack, false otherwise.
- Create a class `Queue` which implements a simple queue using an array of integer values and contains the following methods.
	- `add(int element)`: adds element to the queue.
	- `remove()`: removes and returns the head of the queue. Throws NoSuchElementException if the queue is empty.
	- `peek()`: returns, but does not remove, the head of the queue. Throws NoSuchElementException if the queue is empty.
	- `size()`: returns the number of the elements in the queue.
	- `isEmpty()`: returns true of there are no elements in the queue, false otherwise.
- For each class, add appropriate Javadoc comments and generate Stack.HTML and Queue.HTML for your classes. **Include the runtime of each method in each Javadoc comment description.**

## Tips

- To copy arrays easily, you can use the built in Java method: ` System.arraycopy();`

- 
## Test Cases

- To assess your Stack and Queue classes, you will be responsible for creating your own test cases to check the accuracy of your program before turning it in.
- Make sure your test cases check for correctness against a variety of inputs. 

## Reflection Questions

- What is the fundamental principle behind a stack?
- In what situations would using a stack be beneficial?
- What is the fundamental principle behind a queue?
- In what situations would using a queue be beneficial?
