package CHAPTER_08_MULTI_DIMENSIONAL_ARRAYS;


import java.util.Scanner;

public class Listing_8_1 {
	
	public static void main(String[] args){
		int[][] m= getArray();
		
		System.out.println("\nSum of all elements is " + sum(m));
	}

	
	public static int[][]getArray() {
		Scanner ip=new Scanner(System.in);
		int [][]m= new int[3][4];
    System.out.println(" enter "+m.length+" rows and "+ m[0].length +" coloums: ");
		
		for (int i = 0; i < m.length; i++)
			 for (int j = 0; j < m[i].length; j++)
			 m[i][j] = ip.nextInt();
		
		return m;
	}
		
	

		public static int sum(int[][] m) {
			 int total = 0;
			 for (int row = 0; row < m.length; row++) {
			 for (int column = 0; column < m[row].length; column++) {
			total += m[row][column];
			 }
			}
			 
			 return total;
		
	}
}
