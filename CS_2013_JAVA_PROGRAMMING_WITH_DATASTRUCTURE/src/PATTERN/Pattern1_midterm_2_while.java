package PATTERN;

import java.util.Scanner;

public class Pattern1_midterm_2_while {

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        //Printing upper half of the pattern
	         
	       // for (int i = 1; i <= rows; i++) 
	        
	        int i=1;
	        int j=1;
	        while (i<=rows)
	        {
	            //Printing i spaces at the beginning of each row
	             
	           // for (int j = 1; j < i; j++) 
	        	while (j<i)
	            {
	                System.out.print(" ");
	                j++;
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	           // for (int j = i; j <= rows; j++) 
	        	while(j<rows)
	            { 
	                System.out.print(j+" "); 
	                j++;
	            } 
	            
	            System.out.println(); 
	            i++;
	        } 
	         
	        //Printing lower half of the pattern 
	         
	        for (int i1 = rows-1; i1 >= 1; i1--) 
	       
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j1 = 1; j1 < i1; j1++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int j1 = i1; j1 <= rows; j1++)
	            {
	                System.out.print(j1+" ");
	            }
	             
	            System.out.println();
	        }
	         
	        //Closing the resources
	         
	        sc.close();
	    }
}
