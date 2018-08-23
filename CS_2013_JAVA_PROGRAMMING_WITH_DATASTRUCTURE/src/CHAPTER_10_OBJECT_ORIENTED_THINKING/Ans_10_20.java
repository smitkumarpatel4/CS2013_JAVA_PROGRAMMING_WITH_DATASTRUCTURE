package CHAPTER_10_OBJECT_ORIENTED_THINKING;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ans_10_20 {

	public static BigInteger factorial(int N){
			
			BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
			
		    for (int i = 2; i <= N; i++) {
		    	f = f.multiply(BigInteger.valueOf(i));
		    	
		    }
		        return f;
		    }
		 
		
		public static void main(String args[]) throws Exception
		    {
			BigInteger e = new BigInteger("1");
			
			for(int i=100; i<=1000; i+=100) {
				
				for(int j=1; j<i ;j++){
				
					e=e.add((BigInteger.ONE).divide(factorial(j)));
				}
				
		        
		        System.out.println(e);
		    }
	}
}
