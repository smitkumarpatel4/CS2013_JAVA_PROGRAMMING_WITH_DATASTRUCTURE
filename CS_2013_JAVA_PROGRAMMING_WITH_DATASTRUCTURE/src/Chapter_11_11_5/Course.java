/***
 * Exercise 11_5   Course------>Test_course
 */


package Chapter_11_11_5;
import java.util.ArrayList;
public class Course {
	
	private String courseName;
	private ArrayList<String> students;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	public void addStudent(String s) {
		students.add(s);
	}

	/** Return students in an array */
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}

	/** Return number of students */
	public int getNumberOfStudents() {
		return students.size();
	}

	/** Return course name */
	public String getCourseName() {
		return courseName;
	}

	/** Drop a student for list */
	public void dropStudent(String s) {
		students.remove(s);
	}
}
