package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class Reverse_String_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string to reverse: ");
		String s = input.nextLine();
		System.out.println();
		reverseDisplay(s);
	}	
	public static void reverseDisplay(String s) {
		if(s.length() == 0)
			return;
		
		System.out.print(s.charAt(s.length() - 1));
		reverseDisplay(s.substring(0, s.length() - 1));
		}
	
}
