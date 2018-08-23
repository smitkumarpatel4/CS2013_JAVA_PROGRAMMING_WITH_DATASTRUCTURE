package CHAPTER_10_OBJECT_ORIENTED_THINKING;

import java.math.*;

public class Listing_10_9_Large_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("50! is = " +factorial(50));

	}
	
	public static BigInteger factorial(long n)
	{
		BigInteger result = BigInteger.ONE;
		for (int i=1; i<=n; i++) {
			result =result.multiply(new BigInteger(i +" "));
		}
		
		return result;
	}

}
