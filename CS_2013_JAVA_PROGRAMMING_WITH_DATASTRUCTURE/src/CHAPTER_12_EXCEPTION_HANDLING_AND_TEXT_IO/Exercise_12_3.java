package CHAPTER_12_EXCEPTION_HANDLING_AND_TEXT_IO;
import java.util.Scanner;

public class Exercise_12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[] a = new int[100];
	    
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");
        
        
        try {
            int index = input.nextInt();
            System.out.println("a[" + index + "] = " + a[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("INDEX is out of bounds");
        } catch (Exception ex) {
            System.out.println("INVALID INPUT");
        }

	}

}
