package Midterm_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] A1= {2.3,2.9,2.5,2.1,2.4,2.2};
		
		ArrayList<Double> A= new ArrayList<>(Arrays.asList(A1));
		 for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		 System.out.println();
		 
		 A.add(0, 2.6);
		 for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		 System.out.println();
		 
		 A.add(2.7);
		 A.add(2.8);
		 for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		 System.out.println();
		
		 A.remove(2.1);
		 for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		 System.out.println();
		 
		 System.out.println("Size = "+ A.size());
		 
		 A.set(0, 2.0);
		 for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		 System.out.println();
		 
		 System.out.println("Max = "+ Collections.max(A));
		 System.out.println("Min = "+ Collections.min(A));
		 
		java.util.Collections.shuffle(A);
		for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		 System.out.println();
		 
		java.util.Collections.sort(A);
		for(int i=0; i<A.size(); i++) {
			 System.out.print(A.get(i)+ " ");
		 }
		System.out.println();
		
		double sum=0;
		for(int i=0; i<A.size(); i++) {
			 sum = sum + A.get(i);
		 }
		 System.out.println("sum = " +sum + "\naverage= "+ (sum/A.size()));

		 String s= " Happy birthday "+ 2 + " you! ";
		 System.out.println(s);
		 
		 
		 
		 Integer x=3 + new Integer(5);
		 int y = new Integer(5)+new Integer(4);
		 System.out.println(x + " " + y);
		 
	}

}
