package LAB_ASSIGNMENT_2;

public class Ans_8_ascending_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] q=new int[10];
		
		for(int i =0; i <q.length;i++)
		{
			q[i]=(int)(Math.random()*90)+10;
		}
		
		System.out.println( " Given array");

		for(int i= 0; i <q.length;i++) {
			System.out.print(q[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0;i<q.length-1; i++)
		{
			for(int j=0; j<q.length-1-i; j++)
				if(q[j]>q[j+1])
				{
					int temp=q[j];
					q[j]=q[j+1];
					q[j+1]=temp;
				}
		}
		 		 
		 System.out.println( " Ascending array");
		 
		 for(int i= 0; i <q.length;i++) {
				System.out.print(q[i]+ " ");
			}
	}

}
