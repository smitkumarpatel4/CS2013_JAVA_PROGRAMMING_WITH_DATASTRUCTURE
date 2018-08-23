package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_15_point_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int r=10;
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" enter x and y for origin ");
				double x1 = ip.nextDouble();
				double y1 = ip.nextDouble();
				
				System.out.println(" enter x and y for point ");
				double x2 = ip.nextDouble();
				double y2 = ip.nextDouble();
				
				double d= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
				
		        System.out.println(" d= " +d);
		         if(d<r)
		         {
		        	 System.out.println(" point is within in circle ");
		         }
		         else
		        	 {
		        	 System.out.println(" Point is outside of circle ");
		        	 }
		  }
	
}
