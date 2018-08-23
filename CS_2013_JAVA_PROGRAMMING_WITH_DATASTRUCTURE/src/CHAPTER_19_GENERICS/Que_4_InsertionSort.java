package CHAPTER_19_GENERICS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collection.*;
import java.util.Collections;


public class Que_4_InsertionSort {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);
        InsertionSort(list);
        System.out.println(list);
    }
  
	public static <E extends Comparable<E>> void InsertionSort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }
            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }	    
}
