package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class Find_Character {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    System.out.print("Please enter a string ");
		    String s = input.next();
		    System.out.print("Please enter a character: ");
		    char c = input.next().charAt(0);
		   System.out.println(" given string contain the character " + c + " ? " + recursiveContains(c,s) );
	}
	
	public static boolean recursiveContains(char c, String s){
		if (s.length() == 0)
			return false;
		if(s.charAt(0) == c)
			return true ;
		
		    return recursiveContains(c,s.substring(1));
	}

}
