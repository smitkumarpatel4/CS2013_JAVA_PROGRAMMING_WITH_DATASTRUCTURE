package Quiz_4;
import java.util.Scanner;

	public class Quiz4_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 8 integers for array 1 ");
		int[] A = readArray(8, input);
		SelectionSort(A);
		PrintArray(A);
		System.out.print("Enter 12 integers for array 2 ");
		int[] B = readArray(12, input);
		SelectionSort(B);
		PrintArray(B);
		int[] C = new int[A.length+ B.length];
		C=merge(A,B);
		PrintArray(C);
			
	}
	
	private static int[] readArray(int arraySize, Scanner input) {
		int[] array = new int[arraySize];
		for (int i=0; i<arraySize; i++) {
			array[i] = input.nextInt();
		}
		
		return array;
	}
	

	public static void SelectionSort(int[] list){
		   for (int i = 0; i <list.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j <= list.length; j++) {
		        if (list[j] < list[min]) {
		        	min = j;
		        }
		      
		      int temp = list[i];
		      list[i] = list[min];
		      list[min] = temp;
		        }
		   }
		   
	}
	
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    return answer;
	}
	
	public static void PrintArray(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "  ");
		}

		System.out.println();
	}
}
