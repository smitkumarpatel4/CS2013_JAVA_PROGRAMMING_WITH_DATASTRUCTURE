package ASSIGNMENT_1;


	import java.util.Scanner;

	public class Ans_3 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);	
			

			System.out.print("Enter the monthly saving amount: ");
			double s_amount = input.nextDouble();
			
			System.out.print("Enter the yearly interest rate ");
			double y_ir = input.nextDouble();
	        double m_ir = (y_ir)/(12*100);
	        
	        System.out.print("Enter the time period in month ");
			int m = input.nextInt();
	        
	        
	        double total_amount=0;
	        
	        for(int i= 1; i <= m; i++)
	        {
	        	total_amount = (s_amount + total_amount)* (1+m_ir);
	        	
	        	System.out.println("After the " + i +" month, the account value is " + total_amount);
	    		
	        }
			
		}
	}

