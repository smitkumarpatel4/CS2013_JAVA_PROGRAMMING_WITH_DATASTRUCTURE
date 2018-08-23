package PATTERN;

public class Patterns {
	
	       public static void main(String[] args) {

	              pattern1(5);

	              pattern2(5);

	              pattern3(5);

	              pattern4(5);
	              pattern5(5);

	              pattern6(5);

	              pattern7(9);

	              pattern8(7);

	       }

	      

	       public static void pattern1(int k) {

	              for (int i = 1; i <= k; i++) {

	                     for (int j = 1; j <= i; j++) {

	                           System.out.printf("%2d", j);

	                     }

	                     System.out.println();

	              }

	       }

	      

	       public static void pattern2(int k) {

	              for (int i = k; i >= 1; i--) {

	                     for (int j = 1 ; j <= i ; j++) {

	                           System.out.printf("%2d", j);

	                     }

	                     System.out.println();

	              }

	       }

	      

	       public static void pattern3(int k) {

	              for (int i = k; i >= 1; i--) {

	                     for (int j = i; j >= 1; j--) {

	                           System.out.printf("%2d", j);

	                     }

	                     System.out.println();

	              }

	       }

	      

	       public static void pattern4(int k) {

	              for (int i = 1; i <= k; i++) {

	                     //print spaces

	                     for (int s = 1; s <= k - i; s++)

	                           System.out.print("  ");

	                     //print numbers

	                     for (int n = k - i + 1; n <= k; n++)

	                           System.out.printf("%2d", n);

	                     //end row

	                     System.out.println();

	              }

	       }

	 

	       public static void pattern5(int k) {

	              for (int i = 1; i <= k; i++) {

	                     //print leading spaces

	                     for (int j = 1; j <= k - i; j++)

	                           System.out.print("  ");

	                     //print numbers 1 to i

	                     for (int j = 1; j <= i; j++)

	                           System.out.printf("%2d", j);

	                     //print numbers i-1 to 1

	                     for (int j = i-1; j >= 1; j--)

	                           System.out.printf("%2d", j);

	                     //end row

	                     System.out.println();

	                    

	              }

	       }

	      

	       public static void pattern6(int k) {

	              for (int i = 0; i <= k; i++) {

	                     for (int j = 0; j <= k; j++)

	                           System.out.print((i == j)? i: "0");

	                     System.out.println();

	              }

	       }

	      

	       /**

	       * Question 5 on Midterm 2

	       */

	       public static void pattern7(int k) {

	              for (int i = 0; i <= k; i++) {

	                     //print spaces

	                     for (int j = 1; j < k - i + 1; j++)

	                           System.out.print(" ");

	                     //print tree

	                     for (int j = 1; j <= i; j++)

	                           if (j==1 || j==i || i == k)

	                                  System.out.printf("%2s", "#");

	                           else

	                                  System.out.printf("%2s", "*");

	                     //end row

	                     System.out.println();

	              }

	       }

	      

	       /**

	       * Question 4 on Midterm 2

	       */

	       public static void pattern8(int k) {

	             

	              //print top

	              for (int i = 1; i <= k; i++) {

	                     //spaces

	                     for (int j = 1; j < i; j++)

	                           System.out.print(" ");

	                     //numbers

	                     for (int j = i; j <= k; j++)

	                           System.out.printf("%2d", j);

	                     //next line

	                     System.out.println();

	              }

	                    

	              //print bottom triangle

	              for(int i = k - 1; i >= 1; i--) {

	                     //spaces

	                     for (int j = k-1; j > k - i; j--)

	                           System.out.print(" ");

	                     //numbers

	                     for (int j = i ; j <= k ; j++)

	                           System.out.printf("%2d", j);

	                     //next line

	                     System.out.println();

	              }

	                          

	                    

	       }

}
