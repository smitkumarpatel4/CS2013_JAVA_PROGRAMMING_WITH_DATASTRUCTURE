package CHAPTER_09_OBJECT_AND_CLASSES.copy;

import java.util.Scanner;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void geta(double a) {
		this.a=a;
	}
	
	public void getb(double b) {
		this.b=b;
	}
	
	public void getc(double c) {
		this.c=c;
	}
	
	public double getDiscriminant() {
		return ((b*b)-(4*a*c));
	}
	
	public double getroot1() {
		return ((-b+(Math.sqrt((b*b)-(4*a*c))))/2*a);
	}
	
	public double getroot2() {
		return ((-b-(Math.sqrt((b*b)-(4*a*c))))/2*a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip = new Scanner(System.in);

		System.out.print("Enter a, b, and c ");
		double a = ip.nextDouble();
		double b = ip.nextDouble();
		double c = ip.nextDouble();
		
		QuadraticEquation qe = new QuadraticEquation(a, b, c);

		if (qe.getDiscriminant() < 0)
			System.out.println("the equation has no roots");
		else if (qe.getDiscriminant() > 0) {
			System.out.println("the equation has two roots " + qe.getroot1() + " and " + qe.getroot2());
		}
		else {
			System.out.println("the equation has one root " + (qe.getroot1() > 0  ? qe.getroot1() : qe.getroot2()));
		}				
	}

}
