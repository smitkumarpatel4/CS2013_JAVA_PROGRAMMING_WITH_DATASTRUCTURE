package LINKED_LIST;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class Node
	   {
	      public Object data;
	      public Node next;
	   }
public class Linked_List_02 {

	private Node first;
	private Node position;
    private Node previous;
    private boolean isAfterNext;   
	
	public void addFirst(Object element)
	   {
	      Node newNode = new Node(); //step 1
	      newNode.data = element;
	      newNode.next = first; //step 2
	      first = newNode; // step 3
	   }
	
	public void addLast(Object element)
	{
	   if (first == null) { addFirst(element); }
	   else
	   {
	      Node last = first;
	      while (last.next != null)
	      {
	         last = last.next;
	      }
	      last.next = new Node();
	      last.next.data = element;
	   }
	}
	
	public void add(Object element)
	   {
	      if (position == null)
	      {
	         addFirst(element);
	         position = first;
	      }
	      else
	      {
	         Node newNode = new Node();
	         newNode.data = element;
	         newNode.next = position.next; //step 1
	         position.next = newNode; //step 2
	         position = newNode; //step 3
	      }
	      isAfterNext = false; //step 4
	   } 
	
	public static void main(String[] args) {
		
		   LinkedList<Comparable> list = new LinkedList<Comparable>();
		  
		}
}