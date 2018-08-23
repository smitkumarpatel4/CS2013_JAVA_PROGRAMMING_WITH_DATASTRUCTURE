package PATTERN;

public class PatternC {
			 

	       public static void main(String[] args) {

	              for (int i = 1; i < 7; i++) {

	                     //Print leading spaces

	                     for (int j = 1; j < 7 - i; j++)

	                           System.out.print("  ");

	                     //Print the numbers

	                     for (int j = i; j > 0; j--)

	                           System.out.print(j+" ");

	                     System.out.println("");

	              }

	       }

}
