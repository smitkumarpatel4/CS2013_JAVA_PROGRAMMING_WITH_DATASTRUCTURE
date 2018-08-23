/****  Exercise 11.2
 *     person ---> student
 *     		  ---> Employee ---> Faculty
 *     						---> Staff 
 *     				
 *  
 */
package CHAPTER_11_11_02;

public class Test {

	public static void main(String[] args) {
		
		
		Person person = new Person("Bhumin", "12 Blvd street", "9904654010", "bhumin12@gmail.com");

		Student student = new Student("Shruti", "45 Baldwin Ave", "9879368091","shruti100@aol.com", Student.status.SENIOR);

		Employee employee = new Employee("Kishan", "9876 firestone street", "6189999999", "kishan80@aol.com", 910, 60000);

		Faculty faculty = new Faculty("Jinal", "28 Montaray Park", "4133333333", "jinal8@aol.com", 101, 50000.0, 5, 2);

		Staff staff = new Staff("Neel", "90 Ambaji road", "2030000000", "neel@aol.com", 12, 65000, "Subject Coordinator");

		System.out.println(person.toString());
		System.out.println();
		System.out.println(student.toString());
		System.out.println();
		System.out.println(employee.toString());
		System.out.println();
		System.out.println(faculty.toString());
		System.out.println();
		System.out.println(staff.toString());
			}
	

}