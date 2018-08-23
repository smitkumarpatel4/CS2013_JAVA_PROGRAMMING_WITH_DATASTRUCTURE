package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_4_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip= new Scanner(System.in);
		System.out.println(" Enter any number ");
		int n= ip.nextInt();
		int temp=n;
		int r=0, total=0;
		while(n != 0)
		{
			r = n%10;
			n =n/10;
			total= (r*r*r)+ total; 
		}
		
		System.out.println(" total = "+total);
		
	    
		if(temp == total) System.out.println(" given number is an armstrong number ");
		else
			System.out.println(" given number is not an armstrong number ");

	}
}
