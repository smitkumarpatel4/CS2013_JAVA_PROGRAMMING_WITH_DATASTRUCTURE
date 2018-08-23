/***
 * Exercise 11_5   Course------>Test_course
 */

package Chapter_11_11_5;

public class Test_Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("CS3112");
		Course course2 = new Course("CS2013");

		course1.addStudent("Steve Smith");
		course1.addStudent("Grame Smith");
		course1.addStudent("virat kohli");

		course2.addStudent("virat kohli");
		course2.addStudent("Steve Smith");

		System.out.println("Number of students in course1 "+course1.getCourseName()+" : "+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.println("Number of students in course2 " +course2.getCourseName()+" : "+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");
	}
}