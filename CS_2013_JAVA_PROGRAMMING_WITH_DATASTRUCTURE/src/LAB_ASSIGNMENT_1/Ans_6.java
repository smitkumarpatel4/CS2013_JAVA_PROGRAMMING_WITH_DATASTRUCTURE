package LAB_ASSIGNMENT_1;

import java.util.Scanner;

public class Ans_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double d,e,p,cost;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("enter Distance:");
		d = ip.nextDouble();
		System.out.println("enter Efficiency:");
		e = ip.nextDouble();
		System.out.println("enter Price:");
		p = ip.nextDouble();
		
		cost = d/e*p;
	
		System.out.println("Total fuel Cost :"+cost);
	
	}


}
