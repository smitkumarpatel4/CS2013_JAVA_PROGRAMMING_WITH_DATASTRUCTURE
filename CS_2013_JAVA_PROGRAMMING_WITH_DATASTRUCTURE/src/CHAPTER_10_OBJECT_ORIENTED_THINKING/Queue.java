package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class Queue {
		
	int[]  elements;
	int size;
	
	public Queue(){
		size=8;
		elements= new int[size];
		
	}
	
	public int enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
        elements[size++] = v;	
        
        return v;
	}

	
	 public int dequeue() {
	     int v = elements[0];
	     size--;
	     for (int i = 0; i < size; i++) {
	    	 elements[i] = elements[i + 1];
	    	 }
	     return v;
	 	}

	 public boolean isEmpty() {
        return size == 0;
	 }

	 public int getSize() {
	    return size;
	 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new Queue();
		for (int i = 0; i < 20; i++) {
			System.out.print("  "+queue.enqueue(i+1));
		}
		System.out.println();
		for (int i = 0; i <5; i++) {
			System.out.printf(" ", +queue.dequeue());
		            
		}
	}
}