package LAB_ASSIGNMENT_1;

import java.util.Scanner;

public class Ans_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double r,b = 0,h = 0,l = 0,a = 0,s1 = 0,s2 = 0,s3 = 0,s = 0,cir_area,cir_peri,rec_area,rec_peri,cyl_area,cyl_vol,hexa_area,tri_area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r:");
		r = sc.nextDouble();
		System.out.println("Enter b:");
		b = sc.nextDouble();
		System.out.println("Enter h:");
		h = sc.nextDouble();
		System.out.println("Enter l:");
		l = sc.nextDouble();
		System.out.println("Enter a:");
		a = sc.nextDouble();
		System.out.println("Enter s1:");
		s1 = sc.nextDouble();
		System.out.println("Enter s2:");
		s2 = sc.nextDouble();
		System.out.println("Enter s3:");
		s3 = sc.nextDouble();
		
		s = s1+s2+s3;
		System.out.println(s);

		cir_area = Math.PI*r*r;
		cir_peri = 2*Math.PI*r;
		rec_area = l*b;
		rec_peri = 2*l*b;
		cyl_area = 2*Math.PI*r*(r+h);
		cyl_vol = Math.PI*r*r*h;
		hexa_area = (3*Math.sqrt(3)*a*a)/2;
		tri_area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		
		System.out.println("Area of circle:"+cir_area);
		System.out.println("Perimeter of circle:"+cir_peri);
		System.out.println("Area of Rectangle:"+rec_area);
		System.out.println("Perimeter of rectangle:"+rec_peri);
		System.out.println("Area of cylinder:"+cyl_area);
		System.out.println("volume of cylinder:"+cyl_vol);
		System.out.println("Area of hexagon:"+hexa_area);
		System.out.println("Area of triangle:"+tri_area);
	}
}
