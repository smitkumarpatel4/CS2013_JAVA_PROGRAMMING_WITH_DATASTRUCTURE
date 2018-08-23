package LAB_ASSIGNMENT_1;

import java.util.Scanner;

public class Ans_2B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b;

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a:");
		a = ip.nextDouble();
		System.out.println("Enter b:");
		b = ip.nextDouble();
		
		b = a+b - (a=b);
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
