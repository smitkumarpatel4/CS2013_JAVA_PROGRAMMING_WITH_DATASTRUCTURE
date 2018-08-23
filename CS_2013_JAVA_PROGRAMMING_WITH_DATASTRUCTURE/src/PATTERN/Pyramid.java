package PATTERN;

public class Pyramid {
	
	       public static void main(String[] args) {

	              int maxPower = 4;
	              for (int i = 0; i <= maxPower ; i++) {
	                  //Print out leading spaces
	                     for (int j = 0; j <= maxPower - i; j++)
	                            System.out.print("    ");
                     //Print out the numbers on the left
	                     for (int j = 0; j < i; j++)     
	                         	System.out.printf("%3d ",(int)Math.pow(2, j));
                     //Print number in the middle
	                    		System.out.printf("%3d ",(int)Math.pow(2, i));
                     //Print out right side of pyramid
	                    for (int j = i - 1; j >= 0; j--)
                                 System.out.printf("%3d ",(int)Math.pow(2, j));
	                     //New line

	                     System.out.println("");

	              }

	 

	       }



}
