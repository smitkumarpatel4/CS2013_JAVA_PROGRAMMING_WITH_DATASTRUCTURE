package CHAPTER_12_EXCEPTION_HANDLING_AND_TEXT_IO;
 import java.util.Scanner;

public class Exercise_12_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Create a URL object
			java.net.URL url = new java.net.URL(
				"http://cs.armstrong.edu/liang/data/Lincoln.txt");

			int count = 0; // Counts words

			// Open an input stream and create a Scanner object
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				// Read words
				if (Character.isLetter((input.next()).charAt(0))) {
					count++;
				}
			}

			// Display result
			System.out.println(
				"Number of words in President Abraham Lincoln's Gettysburg address: " +
				count);
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) {
			System.out.println("I/0 Errors: no such file");
		}
	}
}
