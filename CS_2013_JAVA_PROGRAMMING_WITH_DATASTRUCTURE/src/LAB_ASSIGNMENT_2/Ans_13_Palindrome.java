package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_13_Palindrome {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the 3 didgit number");
		int num= ip.nextInt();
		int rev= 0,r=0;
		
		int n=num;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		
		if (num == rev) 
			System.out.println("number is a palindrome");
		else
			System.out.println("number is not a palindrome");
	}

}
