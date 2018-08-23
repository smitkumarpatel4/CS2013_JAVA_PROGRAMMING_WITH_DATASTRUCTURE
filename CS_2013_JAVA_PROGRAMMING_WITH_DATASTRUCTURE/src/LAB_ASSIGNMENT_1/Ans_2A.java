package LAB_ASSIGNMENT_1;

import java.util.Scanner;

public class Ans_2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,t;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a:");
		a = ip.nextDouble();
		System.out.println("Enter b");
		b = ip.nextDouble();
		
		t = a;
		a = b;
		b= t;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
}

}