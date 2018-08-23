package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_1_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip= new Scanner(System.in);
		
		System.out.println(" Enter the number ");
		
		int n=ip.nextInt();
		System.out.println(" given number is " +n);
		reversenumber(n);
		String[] s= {"smit"};
		reversestring(s);
		
	}
	
	public static void reversenumber(int n) {	 
		 int temp =n;
		 int rev =0; 
		 while (n !=0) {
			 
			 int r= n%10;
			  n= n/10;
			 rev=(rev*10)+r;
		 }
		 
		 System.out.println(" reverse number is " +rev);

		}
	
	public static void reversestring(String[] s) {
	        String[] t = new String[s.length];
	        for (int i = 0; i < s.length; i++) {
	            t[i]= new StringBuilder(s[i]).reverse().toString();
	        }
	        for (int i = 0; i < s.length; i++) {
	        System.out.print(t[i]);
	        }
	    }
		
}