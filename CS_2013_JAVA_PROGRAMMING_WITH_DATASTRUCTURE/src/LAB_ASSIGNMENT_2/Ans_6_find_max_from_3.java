package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_6_find_max_from_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip = new Scanner(System.in);
		System.out.println(" Enter 3 number ");
		double n1= ip.nextDouble();
		double n2= ip.nextDouble();
		double n3= ip.nextDouble();

		
		double max= Math.max(n3 , Math.max(n2, n1) );
		
		System.out.println(" Maximum number is "+max);
		
//		if(n1>n2) {
//			if(n1>n3) {
//				System.out.println( " maximum number is " + n1);
//			}
//			else
//			{
//				System.out.println(" maximum number is " + n3);
//			}
//		}
//		else
//		{ 
//			if(n2>n3) {
//			System.out.println( " maximum number is " + n2);
//			
//			}
//		else {
//			System.out.println(" maximum number is " + n3);
//		}
//		}
	}

}
