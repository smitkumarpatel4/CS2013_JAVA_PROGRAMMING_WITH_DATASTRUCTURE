package Midterm_2;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lineNum = 1;

        int leadingSpaceNum = 9;

        do {

               //print leading spaces

               int s = 0;

               do  {

                     System.out.print(" ");

                     s++;

               }while(s < leadingSpaceNum);

               leadingSpaceNum--;

              

               //print characters

               int i = 1;

               do {

                     if(i == 1 || i == lineNum ||lineNum== 9)

                            System.out.print(" #");

                     else

                            System.out.print(" *");

                     i++;

               }while (i <= lineNum);

               lineNum++;

               System.out.println();
        }while (lineNum < 10);
	}              
}
