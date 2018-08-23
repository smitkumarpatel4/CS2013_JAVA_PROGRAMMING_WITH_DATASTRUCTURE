package CHAPTER_19_GENERICS;

import java.util.ArrayList;

public class Exercise_19_3 {
	public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("smit");
	    list.add("bhumin");
	    list.add("vallabh");
	    list.add("smit");
	    list.add("vallabh");


	    System.out.println("Prior to removal: " + list);
	    System.out.println("after: " +removeDuplicates(list) );


	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

	    ArrayList<E> list2 = new ArrayList<E>();

	    for (E elem : list) 
	        if (!list2.contains(elem))
	            list2.add(elem);

	    return list2;

	 }
	  
}