package PATTERN;
import java.util.Scanner;

public class p_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.println("How many rows you want in this pattern?");
		         
		        int rows = sc.nextInt();
		         
		        System.out.println("Here is your pattern....!!!");
		         
		        for (int i = 0; i < rows; i++) 
		        {
		            for (int j = 0; j < rows; j++)
		            {
		                if(i == j)
		                {
		                    System.out.print(i);
		                }
		                else
		                {
		                    System.out.print(0);
		                }
		            }
		             
		            System.out.println();
		        }
		         
		        sc.close();
		    }
}
