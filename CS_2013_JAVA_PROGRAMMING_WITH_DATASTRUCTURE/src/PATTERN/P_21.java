package PATTERN;
import java.util.Scanner;

public class P_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
	 
	        //Taking noOfRows value from the user
	 
	        System.out.println("How Many Rows You Want In Your Pyramid?");
	 
	        int noOfRows = 9;
	 
	        //Initializing rowCount with 1
	 
	        int rowCount = 1;
	 
	        System.out.println("Here Is Your Pyramid");
	 
	        //Implementing the logic
	 
	        for (int i = noOfRows; i > 0; i--)
	        {
	            //Printing i spaces at the beginning of each row
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            //Printing * at the end of each row
	 
	            for (int j = 1; j <= rowCount; j++) {
	           
	            	System.out.print("* ");
	 
	            }
	            System.out.println();
	 
	            //Incrementing the rowCount
	 
	            rowCount++;
	        }
	}
}
