package LAB_ASSIGNMENT_3;

public class Ans_1_Array_Mul_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l=3;
		int[][] m1 =matrix(3);
		print(m1);
		int[][] m2 =matrix(3);
		print(m2);
		
		addition(m1 ,m2, l);
		multiplication(m1, m2, 1);
	}
		public static int[][] matrix(int l) {
			int[][] m = new int[l][l];
			for(int row = 0; row < l ; row++) {
			for(int coloum=0; coloum<l; coloum++) {
			 m[row][coloum]=(int)(Math.random()*90)+10;
			}
		}
			return m;
		}
		
		public static void print( int[][] m1) {
					System.out.println("matrix 1");
				for(int row = 0; row < m1.length; row++) {
					for(int coloum=0; coloum<m1[row].length; coloum++) {
					System.out.print(m1[row][coloum] +"  ");	
					}
					System.out.println();
			}
		}
		
public static void addition(int[][]m1, int[][] m2, int  l)	{	
		int[][] sum=new int[3][3];
		System.out.println(" sum of matrix 1 and matrix 2");
		for(int row =0; row < l; row++) {
			for(int coloum=0; coloum<l; coloum++) {
				sum[row][coloum] = m1[row][coloum] + m2[row][coloum] ;
			}
		}
			for(int row1 =0; row1 < sum.length; row1++) {
				for(int coloum=0; coloum<sum[row1].length; coloum++) {
				  System.out.print(sum[row1][coloum]+"  ");
				}
			System.out.println();
			}
			
}
public static void multiplication(int[][]m1, int[][] m2, int  l)	{		
	    int[][] mul=new int[3][3];	
		for (int i = 0; i <m1.length; i++) { 
		    for (int j = 0; j < m2[0].length; j++) { 
		        for (int k = 0; k < m1[0].length; k++) { 
		            mul[i][j] += m1[i][k] * m2[k][j];
		        }
		    }
		}	
		System.out.println(" Multiplicatiopn of two matrics m1 and m2");
		for(int row1 =0; row1 < m1.length; row1++) {
			for(int coloum=0; coloum<m1[row1].length; coloum++) {
			  System.out.print(mul[row1][coloum]+"  ");
			}
		System.out.println();
		}
	 }

}
