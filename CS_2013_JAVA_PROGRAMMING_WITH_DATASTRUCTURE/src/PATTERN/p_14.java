package PATTERN;
import java.util.Scanner;

public class p_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.println("How many rows you want in this pattern?");
		         
		        int rows = sc.nextInt();
		         
		        System.out.println("Here is your pattern....!!!");
		         
		        for (int i = 1; i <= rows; i++) 
		        {
		            int num;
		             
		            if(i%2 == 0)
		            {
		                num = 0;
		                 
		                for (int j = 1; j <= rows; j++)
		                {
		                    System.out.print(num);
		                     
		                    num = (num == 0)? 1 : 0;
		                }
		            }
		            else
		            {
		                num = 1;
		                 
		                for (int j = 1; j <= rows; j++)
		                {
		                    System.out.print(num);
		                     
		                    num = (num == 0)? 1 : 0;
		                }
		            }
		             
		            System.out.println();
		        }
		         
		        sc.close();
		    
	}

}
