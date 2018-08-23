/**1+(1+2)+(1+2+3)+.........(1+2+3+...+n) ****/


package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_2_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int total=0;
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the n ");
		int n=ip.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				sum=j+sum;
				
			}
			System.out.print(sum + " ");
				total=total+sum;
				sum=0;
		}
	System.out.println();
	System.out.println( " total of all term is "+total );
		
	}

}
