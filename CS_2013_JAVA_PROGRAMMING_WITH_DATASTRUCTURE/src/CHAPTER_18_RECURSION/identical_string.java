package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class identical_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("Please enter a string ");
	    String s = input.next();
	    System.out.println(String.format(" given string is identical or not ?" + recursiveAllCharactersSame(s)));
	  }

	public static boolean recursiveAllCharactersSame(String s){
			if(s.length()==0) {
			return true;
		}
		else if(s.length()==1) {
			return true;		
		}
		else if(s.charAt(0)==s.charAt(1)) {
			return recursiveAllCharactersSame(s.substring(1));
		}
		else {
			return false;
		}		
	}
}
