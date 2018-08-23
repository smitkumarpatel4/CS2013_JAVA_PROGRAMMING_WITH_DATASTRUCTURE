/****Exercises 10.6   Displaying prime numbers  
 *   ***/

package CHAPTER_10_OBJECT_ORIENTED_THINKING;

import java.util.Scanner;

public class StackOfInt {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfInt() {
		this (DEFAULT_CAPACITY);
	}

	public StackOfInt(int capacity) {
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
	
	Scanner ip= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n= ip.nextInt();
	System.out.println("prime numbers");
	StackOfIntegers s = new StackOfIntegers();
	for (int i = 2; i < n; i++) {
		if (isPrime(i)) {
			s.push(i);
			}
		}
	while (!s.empty()) {
		System.out.print(s.pop() + " ");
        }
    }

public static boolean isPrime(int n) {
	
	for (int i = 2; i <n ; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}