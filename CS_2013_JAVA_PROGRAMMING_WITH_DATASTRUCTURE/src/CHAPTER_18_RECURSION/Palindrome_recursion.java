package CHAPTER_18_RECURSION;

public class Palindrome_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SmimS";
		
		System.out.println(IsPalindrome(s));
	}
	
	public static boolean IsPalindrome(String s) {
		
		if(s.length()<=1) {
			return true;
		}
		else if (s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}
		else {
			return IsPalindrome(s.substring(1, s.length()-1));
		}
	}

}
