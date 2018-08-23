package CHAPTER_12_EXCEPTION_HANDLING_AND_TEXT_IO;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1=0,n2=0;
	        Scanner ip = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        boolean again =false;
	        while(!again) {
	           try {
	                n1 = ip.nextInt();
	                n2 = ip.nextInt();
	                again=true;
	                
	            }
	            catch (InputMismatchException ex) {
	                ip.nextLine();
	                System.out.println("Invalid input" );
	                System.out.print("Enter two numbers: ");
	            }
	        }
	        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}
}