/*** Exercises 10.5 Displaying Smallest factors of number
 *  ***/


package CHAPTER_10_OBJECT_ORIENTED_THINKING;

import java.util.Scanner;

public class StackOfIntegers{
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public int peek() {
		return elements[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
	
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n = input.nextInt();

	System.out.println("smallest factors of " + n );
	StackOfIntegers s = new StackOfIntegers(); // Create a StackOfIntegers

	smallestFactors(n, s);

	while (!s.empty()) {
		System.out.print(s.pop() + " ");
	}
	System.out.println();
	}

public static void smallestFactors(int n, StackOfIntegers stack) {
	int i = 2; 
	while (n / i != 1){ 
		if (n % i == 0) {
			stack.push(i);
			n = n/i;
		}
		else
			i++;
	}
	stack.push(n);
}
}
