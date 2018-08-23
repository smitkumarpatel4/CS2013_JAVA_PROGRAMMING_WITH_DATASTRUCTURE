package LAB_ASSIGNMENT_2;

import java.util.Scanner;

public class Ans_9_insert_element_into_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip= new Scanner(System.in);
		System.out.println(" enter array length ");
		int n= ip.nextInt();
		int [] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*90)+100;
		}
		 
		for(int i= 0; i<n; i++) {
			System.out.print( a[i]+" ");
		}
		
		System.out.println();
		System.out.println("  specific index to insert element ");
		int index=ip.nextInt();
		System.out.println(" enter the num, that you want insert ");
		int num=ip.nextInt();
		InsertArray(a, index, a.length, num);
	}

public static void InsertArray(int[] a, int index, int l, int num){
	 l=l+1;
	 int list[] = new int[l];
	 
	 for(int i=0; i<index; i++) {
		 list[i]=a[i];
	 }
	 
	 list[index]=num;
	 
	 for(int i= index+1; i<l; i++)
	 {
		 list[i]=a[i-1];
	 }
	 for(int i=0; i<l; i++) {
		 System.out.print(list[i]+ " ");
	 }
	 
 }
	
		
		
		
	

}
