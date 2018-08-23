package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_10_sum_array_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip = new Scanner(System.in);
		System.out.println(" Enter the array of size");
		int n= ip.nextInt();
		int [] p=new int[n];
		
		for(int i=0; i<p.length;i++)
		{
			p[i]=(int)(Math.random()*99);
		}
		
		System.out.println(" Given array p: ");
		for(int i=0; i<p.length;i++)
		{
			System.out.print(p[i]+ " ");
		}
		
		System.out.println();
		System.out.println(" sum of array p: ");
		int sum= 0;
		for(int i=0; i<p.length;i++)
		{
			sum += p[i];
		}
		
		System.out.println(sum);
		
		float avg= (float)(sum)/n;
		
		System.out.println(" Average of array is "+ avg);
	}

}
