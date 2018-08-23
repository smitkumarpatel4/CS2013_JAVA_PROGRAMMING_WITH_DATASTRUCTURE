package CHAPTER_25_BINARY_SEARCH_TREE;

public class q_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list= {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		int b= binarySearch(list,710,0,list.length-1);
		System.out.println(b);
	}
	
	
	
	
	public static int binarySearch(int[] list, int key,int low, int high) {
		int mid =(low+high)/2;
		while(high>low) {
		if(key> list[mid])
			return binarySearch(list, key,mid+1,high);
		else if(key == list[mid])
			return mid;
		else
			return binarySearch(list, key , low, mid-1);
		}
		return -1;
	}
	
}