package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
	    String s = new Scanner(System.in).nextLine();
	    reverseDisplay(s);

	    }
	    public static void reverseDisplay(String s) {
	    	if (s.length() == 0)
	            return;
	        else
	        System.out.print(s.charAt(s.length()-1));
	        reverseDisplay(s.substring(0, s.length()-1));
	    }

	    
}
