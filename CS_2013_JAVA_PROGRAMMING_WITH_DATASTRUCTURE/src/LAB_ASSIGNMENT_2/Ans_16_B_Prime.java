package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_16_B_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip = new Scanner(System.in); 
		System.out.println(" enter the number ");
		boolean flag = false;
		
		int a= ip.nextInt();
		 for(int i= 2;i<a/2;i++)
		 {
			 if( a%i == 0)
				 {
				  flag = true;
				 }
						
		 }
		 
		 if(flag)
		 {
			 System.out.println("number is  prime");
		 }
		 else
			 System.out.println("number is not prime");

	}

}
