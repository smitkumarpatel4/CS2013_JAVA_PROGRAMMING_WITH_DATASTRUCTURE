
/***
 *  Exercise 11.10  MyStack Exersice_11_10
 */
package Chapter_11_11_10;

import java.util.Scanner;

public class Test_Exercise_11_10 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			MyStack stack = new MyStack();

			System.out.print("Enter five strings: ");
			for (int i = 0; i < 5; i++) {
				stack.push(input.next());	
			}

			System.out.println( stack.toString());
		}

}
