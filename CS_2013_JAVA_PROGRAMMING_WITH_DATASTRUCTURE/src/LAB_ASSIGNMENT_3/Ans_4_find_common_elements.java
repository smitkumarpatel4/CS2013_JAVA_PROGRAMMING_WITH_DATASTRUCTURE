package LAB_ASSIGNMENT_3;

public class Ans_4_find_common_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int a1[] = {16, 54, 10, 25, 40, 78};
        int a2[] = {6, 7, 25, 78, 100};
        int a3[] = {3, 4, 15, 27, 30, 78, 80, 120};
 
        System.out.print("Common elements are ");
      
	        int i = 0, j = 0, k = 0;
	 
	        
	        while (i < a1.length && j < a2.length && k < a3.length)
	        {
	            if (a1[i] == a2[j] && a2[j] == a3[k])
	             {   System.out.print(a1[i]+" ");   i++; j++; k++; }
	 
	             else if (a1[i] < a2[j])
	                 i++;
	 
	            
	             else if (a2[j] < a3[k])
	                 j++;
	 
	            
	             else
	                 k++;
	        }
	}
}
