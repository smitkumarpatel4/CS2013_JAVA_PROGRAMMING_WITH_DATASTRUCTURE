package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class Reverse_integer {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
	    int value = new Scanner(System.in).nextInt();
	    reverseDisplay(value);

	    }
	
	public static void reverseDisplay(int value) {
        if (value == 0)
            return;

        System.out.print(value % 10);
        reverseDisplay(value / 10);
	    }
}