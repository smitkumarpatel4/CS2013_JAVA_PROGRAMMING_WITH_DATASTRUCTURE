package ASSIGNMENT_1;

	import java.util.Scanner;

	public class Ans_6 {

			public static void main(String[] args)
				{
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" enter x and y for point 1 ");
				double x1 = ip.nextDouble();
				double y1 = ip.nextDouble();
				
				System.out.println(" enter x and y for point 2 ");
				double x2 = ip.nextDouble();
				double y2 = ip.nextDouble();
				
				System.out.println(" enter x and y for point 3 ");
				double x3 = ip.nextDouble();
				double y3 = ip.nextDouble();
				
				
				double s1= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
				double s2= Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
				double s3= Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
				
				double s=(s1+s2+s3)/2;
				double area= Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		        System.out.println(" Area of triangle =" +area);
				}

}
