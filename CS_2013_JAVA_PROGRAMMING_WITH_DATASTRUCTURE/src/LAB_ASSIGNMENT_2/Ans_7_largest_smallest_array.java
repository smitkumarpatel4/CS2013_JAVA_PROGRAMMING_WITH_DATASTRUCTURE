package LAB_ASSIGNMENT_2;

public class Ans_7_largest_smallest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] p=new int[10];
		
		for(int i=0; i<p.length;i++)
		{
			p[i]=(int)(Math.random()*99);
		}
		
		System.out.println(" Given array p: ");
		for(int i=0; i<p.length;i++)
		{
			System.out.print(p[i]+ " ");
		}
		
		int max = p[0];
		for(int i=1; i<p.length;i++)
		{
				if(p[i]> max) max=p[i];
				
		}
		
		System.out.println();
		System.out.println("largest number is " +max );
		
		int min = p[0];
		for(int i=1; i<p.length;i++)
		{
				if(p[i]< min) min =p[i];
				
		}
		
		System.out.println("smallest number is " +min );
		
		
	}

}
