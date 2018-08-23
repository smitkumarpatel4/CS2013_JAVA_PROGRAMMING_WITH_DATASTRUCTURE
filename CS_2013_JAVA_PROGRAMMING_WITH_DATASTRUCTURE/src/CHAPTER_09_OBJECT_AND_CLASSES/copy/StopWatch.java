package CHAPTER_09_OBJECT_AND_CLASSES.copy;

public class StopWatch {
	
	private double startTime;
	private double endTime;

	StopWatch() {
	    startTime = System.currentTimeMillis();
	}

	public void start() {
	    startTime = System.currentTimeMillis();

	} 

	public void stop() {
	    endTime = System.currentTimeMillis();
	}
	
	public double getStartTime() {
		return startTime;
	}
	
	public double getEndTime() {
		return endTime;
	}

	public double getElapsedTime(){
		return (getEndTime()-getStartTime());
	}
	
	public static void main(String Args[]) {
		
		
		StopWatch sw = new StopWatch();

		int[] a = getArray();

		
		sw.start();
		SelectionSort(a);
		sw.stop();

		System.out.println("The execution time = " + sw.getElapsedTime());
		
	}
	
	public static int[] getArray(){		
			
		int[] a= new int[100000];
			for (int i = 0; i < a.length; i++) {
				a[i] = (int)(Math.random() * 100000);
			}
		return a;
	}
	
	public static void SelectionSort(int[] list){
		   for (int i = 0; i <list.length-1; i++){
		      int min = i;
		      for (int j = i+1; j < list.length; j++) {
		        if (list[j] < list[min]) {
		        	min = j;
		        }
		      
		      int temp = list[i];
		      list[i] = list[min];
		      list[min] = temp;
		        }
		   }		   
	}	
} 