package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_16_A_Factorial {
	
	
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the number to find its factorial");
		int n=ip.nextInt();
		int f=1;
		for(int i=n; i>0; i-- ) {
			f *= i;
		}
		
		System.out.println(" Factorial of" +n + " is " + f);
				
		
				
	}
	
//	public static int fact(int num) {
//		
//		int x= (num*(fact(num-1)));
//		return (x);
//	}

}
