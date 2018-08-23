package CHAPTER_18_RECURSION;

public class Find_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(powerN( 4.0,-2));
	}
	
	public static double powerN(double x, int n){

		if (n==0)
			return 1;
		else if (n>0)
			return x*powerN(x,n-1);
		else
			return 1/x* powerN(1.0/x,-n-1);
		
	
	}

}
