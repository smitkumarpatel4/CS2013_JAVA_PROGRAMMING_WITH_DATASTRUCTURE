package CHAPTER_18_RECURSION;

public class Palindrome_Recursive_HelperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SmimS";
		
		System.out.println(IsPalindrome(s));
	}
	
	public static boolean IsPalindrome(String s) {
		return IsPalindrome(s,0,s.length()-1);
		
	}
	
	private static boolean IsPalindrome(String s, int low, int high) {
		if (high <= low)
			return true;
		else if (s.charAt(low) != s.charAt(high))
		    return false;
		else
			return IsPalindrome(s, low+1, high-1);
		    	
			
		
	}
}
