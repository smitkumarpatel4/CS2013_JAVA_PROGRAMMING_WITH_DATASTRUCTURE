package PATTERN;
import java.util.Scanner;

public class p_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i+1; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	         
	        //Close the resources
	         
	        sc.close();
	    }

}
