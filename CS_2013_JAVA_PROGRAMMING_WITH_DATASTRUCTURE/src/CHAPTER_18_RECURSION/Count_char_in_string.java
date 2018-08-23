package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class Count_char_in_string {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Please enter a string ");
	    String s = input.next();
	    System.out.print("Please enter a character: ");
	    char c = input.next().charAt(0);
	    int count = count( c,s);
	    System.out.println(String.format(" how many times " + c + " in a string " + s +" ? ---> " + count));
	  }

	  public static int count(char c,String s) {
	    if (s.length() == 0) {
	      return 0;
	    }
	    int count = 0;
	    if (s.charAt(0) == c) {
	      count++;
	    }
	    return count + count(c, s.substring(1));
	  }


	}