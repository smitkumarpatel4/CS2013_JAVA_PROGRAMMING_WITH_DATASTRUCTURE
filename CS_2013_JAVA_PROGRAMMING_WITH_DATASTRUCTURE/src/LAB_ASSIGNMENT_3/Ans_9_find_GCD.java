package LAB_ASSIGNMENT_3;

public class Ans_9_find_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n2=232,n1=432 ;
		int gcd = 1;
		int i;
		
		if(n1<n2) {
			n1=n1+n2-(n2=n1);
		}
		
		for ( i= 2; i<n1/2 && i<n2/2 ; i++) {
			
			if(n1%i == 0 && n2%i==0)
			{
				gcd=i;
			}
			
		}
				System.out.println(gcd);
	}
}