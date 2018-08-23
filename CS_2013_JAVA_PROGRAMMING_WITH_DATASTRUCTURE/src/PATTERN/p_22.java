package PATTERN;
import java.util.Scanner;

public class p_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        Scanner sc = new Scanner(System.in);
		 
		        //Taking noOfRows value from the user
		 
		        System.out.println("How Many Rows You Want In Your Pyramid?");
		 
		        int noOfRows = sc.nextInt();
		 
		        //Initializing rowCount with 1
		 
		        int rowCount = 1;
		 
		        System.out.println("Here Is Your Pyramid");
		 
		        //Implementing the logic
		 
		        for (int i = noOfRows; i > 0; i--)
		        {
		            //Printing i*2 spaces at the beginning of each row
		 
		            for (int j = 1; j <= i*2; j++)
		            {
		                System.out.print(" ");
		            }
		 
		            //Printing j value where j value will be from 1 to rowCount
		 
		            for (int j = 1; j <= rowCount; j++)             
		            {
		                System.out.print(j+" ");
		            }
		 
		            //Printing j value where j value will be from rowCount-1 to 1
		             
		            for (int j = rowCount-1; j >= 1; j--)
		            {                 
		                System.out.print(j+" ");             
		            }                          
		             
		            System.out.println();
		 
		            //Incrementing the rowCount
		 
		            rowCount++;
		        }
		 }
	}
}