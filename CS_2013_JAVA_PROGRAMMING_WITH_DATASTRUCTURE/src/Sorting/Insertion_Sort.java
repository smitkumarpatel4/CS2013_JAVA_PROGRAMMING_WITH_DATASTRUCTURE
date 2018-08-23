package Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] A = { 1, 9, 4.5, 6.6, 5.7, -4.5 };
		PrintArray(A);
		InsertionSort(A);
		PrintArray(A);
	}

	public static void InsertionSort(double[] A) {
		int i=0;
		int j=0; 
		double key=0;
		for (j = 1 ; j <= A.length - 1; j++) 
		{
			key = A[j];
			i=j-1;
			while (i>=0 && A[i]>key) {
				A[i+1]= A[i];
				i=i-1;
			}
			A[i+1]=key;	
			PrintArray(A);
		}
	}

	public static void PrintArray(double[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "  ");
		}
		System.out.println();
	}
}
