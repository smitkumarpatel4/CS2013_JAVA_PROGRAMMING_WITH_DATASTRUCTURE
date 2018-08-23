/***
 *   Exercise 11.6   Circle   Loan    Test_Exercise_11_6
 */
package Chapter_11_11_6;
import java.util.ArrayList;
import java.util.Date;
public class Test_Exercise_11_6 {

	public static void main(String[] args) {
		

		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(new Loan());		
		obj.add(new Date());		
		obj.add(new String("Shreyas Patel"));	
		obj.add(new Circle());	

		for (int i = 0; i < obj.size(); i++) {
			System.out.println((obj.get(i)).toString());
		}
	}
}
