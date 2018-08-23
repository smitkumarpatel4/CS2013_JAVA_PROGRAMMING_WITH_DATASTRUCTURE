package CHAPTER_08_MULTI_DIMENSIONAL_ARRAYS;

import java.util.Scanner;
 
public class Array_2d_length {
	public static void main(String args[]) {
		Scanner ip= new Scanner(System.in);	
	
	int[][] matrix = new int[5][5];
	int sum=0;
	
	// System.out.println(" enter "+ matrix.length + " row and " + matrix[0].length +  "coloums");
		for(int row = 0; row < matrix.length ; row++) {
		for(int coloum=0; coloum<matrix[row].length; coloum++) {
		// matrix[row][coloum]=ip.nextInt();
		 matrix[row][coloum]=(int)(Math.random()*90)+10;
		}
	}
	
	for(int row = 0; row < matrix.length; row++) {
		for(int coloum=0; coloum<matrix[row].length; coloum++) {
		System.out.print(matrix[row][coloum] +"  ");	
		}
		System.out.println();
	}
	
	for(int row =0; row < matrix.length; row++) {
		for(int coloum=0; coloum<matrix[row].length; coloum++) {
			sum += matrix[row][coloum] ;
		}
	}
	System.out.println(" sum of 2d array "+ sum);
	
	for(int row =0; row < matrix.length; row++) {
		int total=0;
		for(int coloum=0; coloum<matrix[row].length; coloum++) {
			total += matrix[row][coloum] ;
		}
		System.out.println(" sum of row " + (row+1) + " of 2d array "+ total);
	}
	
	}
}
