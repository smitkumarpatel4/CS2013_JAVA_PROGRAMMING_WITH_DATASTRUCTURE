package LAB_ASSIGNMENT_3;

import java.util.Scanner;

public class Ans_5_A_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int rows = 5;
		       		         
		        for (int i = 1; i <= rows; i++) 
		        {
		            int num = i;
		             
		            for (int j = 1; j <= i; j++) 
		            {
		                System.out.print(num+" ");
		                 
		                num = num+rows-j;
		            }
		             
		            System.out.println();
		        }
		    }
}
