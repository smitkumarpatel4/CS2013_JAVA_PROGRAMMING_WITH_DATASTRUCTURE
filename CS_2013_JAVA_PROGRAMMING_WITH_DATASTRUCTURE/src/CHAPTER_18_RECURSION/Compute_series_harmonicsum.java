package CHAPTER_18_RECURSION;

import java.util.Scanner;

public class Compute_series_harmonicsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer: ");
	    int n = new Scanner(System.in).nextInt();
		System.out.println(harmonicSum(n));
	}
	public static double harmonicSum(int n){
		
		if(n == 1)
			return 1;
		
		return ((1.0/n) + harmonicSum(n-1));
		
	}
}