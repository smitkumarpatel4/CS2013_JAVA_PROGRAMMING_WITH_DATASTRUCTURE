package CHAPTER_19_GENERICS;
import java.util.ArrayList;
import java.util.Collections;
public class Que_3_bubble_sort {
	
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

       
    }

   
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		boolean needNextPass = true;

		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i].compareTo(list[i + 1]) > 0) {
					// Swap list[i] with list[i + 1]
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}
	
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}
}