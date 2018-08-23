package ASSIGNMENT_1;


	import java.util.Scanner;

	public class Ans_5 {
		 public static void main(String[] args)
		 {
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" enter x and y for point 1 ");
				double x1 = ip.nextDouble();
				double y1 = ip.nextDouble();
				
				System.out.println(" enter x and y for point 2 ");
				double x2 = ip.nextDouble();
				double y2 = ip.nextDouble();
				
				double d= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
				
		        System.out.println(" d= " +d);
		 }
	

}
