package DECIMAL_TO_BINARY;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner ip= new Scanner(System.in);
		 System.out.println(" enter the number ");
		 int num = ip.nextInt();
		 ConvertBinary(num);
		 
	}
		public static void ConvertBinary(int num){
		     int binary[] = new int[40];
		     int i = 0;
		     while(num > 0){
		       binary[i] = num%2;
		       num = num/2;
		       i++;
		     }
		     for(int j = i-1;j >= 0;j--){
		       System.out.print(binary[j]);
		     }
		     
		  }

}
