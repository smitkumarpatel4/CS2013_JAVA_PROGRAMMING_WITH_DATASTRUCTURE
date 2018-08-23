package ASSIGNMENT_1;

	import java.util.Scanner;

	public class Ans_8 {
		
		 public static void main(String[] args)
		 {
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" Enter weight in pound and hight in feet and hight in inches ");
				double w_p = ip.nextDouble();
				double h_f = ip.nextDouble();
				double h_i = ip.nextDouble();
				
				double w_kg = w_p * 0.45359273;
				double h_m = (h_i * 0.0254)+(h_f*15*0.0254);
				
				double BMI= w_kg/(h_m*h_m);
				
				System.out.println("BMI is"+BMI);
				
				if(BMI<18.5)
					System.out.println(" underweight ");
				else if(BMI<25)
					System.out.println(" normal ");
				else if(BMI<30)
				System.out.println(" overweight ");
				else 
					System.out.println(" obesity ");
				
				
				
	     }


}
