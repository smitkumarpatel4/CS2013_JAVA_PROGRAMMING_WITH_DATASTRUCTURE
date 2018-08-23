package ASSIGNMENT_1;

import java.util.Scanner;

public class Ans_1 {

		 public static void main(String[] args){
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" Enter gratuity and subtotal ");
				double gra_rate = ip.nextDouble();
				double subtotal = ip.nextDouble();
				

				
				double gratuity=(gra_rate*100)/subtotal;
				
				double total= subtotal+ gratuity;
				System.out.println(" gratuity= "+ gratuity + " and total = " + total);

			
	}

}
