package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class Ans_10_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  for (int i = 2; i <= 100; i++) {
	 
	   int prime = mersennePrime(i);
	 
	   if (prime != 0) {
	    System.out.println(i+": " +prime);
	   }
	
	  }
	 
	 }
	 
	 
	 public static int mersennePrime(int n) {
	 
	  int prime = (int) Math.pow(2, n) - 1;
	  if (isPrime(prime)) {
	   return prime;
	  }
	 
	  return 0;
	 
	 }
	 
	 public static boolean isPrime(int n) {
	  for (int i= 2; i <= n / 2; i++) {
	   if (n % i == 0) { 
	    return false; 
	   }
	  }
	 
	  return true;
	 }
}