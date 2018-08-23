package LAB_ASSIGNMENT_1;

import java.util.Scanner;

public class Ans_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s= 0,a= 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the speed and accelaration");
		s = ip.nextDouble();
		a = ip.nextDouble();
		
		double length= (s*s)/(2*a);
		
		System.out.println("Runway length is :"+length);
	}
}
