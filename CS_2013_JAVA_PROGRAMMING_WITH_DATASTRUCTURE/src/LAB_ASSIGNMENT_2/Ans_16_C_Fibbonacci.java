package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_16_C_Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the number");
		 int febCount = ip.nextInt();
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++){
                 System.out.print(feb[i] + " ");
         }
		
		

	}

}
