/**
 * Exercise 11.4
 */
package Chapter_11_11_4;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercises_11_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter numbers in arraylist \"if you want exit array list press 0 \" :");
		Integer number = input.nextInt();
		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		System.out.println("The maximum number is " + max(list));
	}

	
public static Integer max(ArrayList<Integer> a) {
	if (a.size() == 0)
		return null;

	Integer max = a.get(0);
	for (int i = 0; i < a.size(); i++) {
		if (a.get(i) > max)
			max = a.get(i);
	}
	return max;
}
}