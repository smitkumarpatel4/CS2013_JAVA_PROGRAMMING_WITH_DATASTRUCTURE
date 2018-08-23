package CHAPTER_09_OBJECT_AND_CLASSES.copy;

import java.util.Scanner;

public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
		
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
	
	public void getd(double d) {
		this.d=d;
	}
	
	public void gete(double e) {
		this.e=e;
	}
	
	public void getf(double f) {
		this.f=f;
	}
	
	public boolean isSolvable() {
		if((a*d-b*c) !=0) {
			return true;
		}
		else return false;
	}
	public double getX() {
		
		return (((e*d)-(b*f))/((a*d)-(b*c)));
	}
	
	public double getY() {
		
		return (((a*f)-(e*c))/((a*d)-(b*c)));
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip = new Scanner(System.in);

		System.out.print("Enter a, b, c, d and e ");
		double a = ip.nextDouble();
		double b = ip.nextDouble();
		double c = ip.nextDouble();
		double e = ip.nextDouble();
		double d = ip.nextDouble();
		double f = ip.nextDouble();
		
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);

		if (le.isSolvable()) {
			System.out.println(" x is " + le.getX() + " and y is " + le.getY());
		}
		else
			System.out.println(" The equation has no solution.");
	}

}