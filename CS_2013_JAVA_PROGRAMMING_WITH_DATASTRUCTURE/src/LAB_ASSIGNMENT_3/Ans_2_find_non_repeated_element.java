package LAB_ASSIGNMENT_3;

public class Ans_2_find_non_repeated_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= { 1, 2, 7, 8, 4, 8, 7, 2, 1};
		int element = a[0];
			for(int i=0; i<a.length-1; i++) {
				element = element ^ a[i];
			}
		
		System.out.println(element);
		}

}
