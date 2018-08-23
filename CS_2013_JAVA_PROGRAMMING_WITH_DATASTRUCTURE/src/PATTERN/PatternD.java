package PATTERN;

public class PatternD {
	  public static void main(String[] args) {

          for (int i = 1; i < 7; i++) {

                 //Print leading spaces

                 for (int j = 1; j < i; j++)

                       System.out.print("  ");

                 //Print numbers

                 for (int j = 1; j <= 7 - i ; j++)

                       System.out.print(j + " ");

                 //End line

                 System.out.println("");

          }



   }

}
