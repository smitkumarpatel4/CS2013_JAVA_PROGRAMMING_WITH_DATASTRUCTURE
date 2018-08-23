package LAB_ASSIGNMENT_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ans_3_kth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer a[] = new Integer[]{1, 23, 12, 9, 30, 2, 50};
		 Scanner ip= new Scanner(System.in);
		 System.out.println(" enter the ____th largest numbers");
	        int k = ip.nextInt();
	        kLargest(a, k);
	        System.out.println();
	        ksmallest(a,k);

	}
	
	public static void kLargest(Integer [] a, int k){
		Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
       // System.out.print(a[i] + " ");
        }
        System.out.println(a[k-1]);
    }
       
	
    public static void ksmallest(Integer [] a, int k){
    	Arrays.sort(a);
        for (int i = 0; i < k; i++) {
        System.out.print(a[i] + " ");
        } 
    }

}
