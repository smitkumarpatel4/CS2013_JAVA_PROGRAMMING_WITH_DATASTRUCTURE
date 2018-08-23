package ASSIGNMENT_1;

	import java.util.Scanner;

	public class Ans_4 
	{

		 public static void main(String[] args)
		 {
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" Enter weight in pound and hight in inches ");
				double w_p = ip.nextDouble();
				double h_i = ip.nextDouble();
				
				double w_kg = w_p * 0.45359273;
				double h_m = h_i * 0.0254;
				
				double BMI= w_kg/(h_m*h_m);
				
				System.out.println("BMI is"+BMI);
				
			
				
				
	     }
	
}
