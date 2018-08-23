/****  Exercise 11.2
 *     person ---> student
 *     		  ---> Employee ---> Faculty
 *     						---> Staff 
 *     				
 *  
 */
package CHAPTER_11_11_02;

public class Student extends Person {
	
	
	enum status{FRESHMAN, SOPHOMORE, JUNIOR, SENIOR}

	private status status;	
	public Student(String name, String address,String phone, String email, status status) {
		super(name, address, phone, email);
		this.status = status;
	}
	
	public void setStatus(status status) {
		this.status = status; 
	}
	
	/** Return status */
	public String getStatus() {
		switch (status) {
			case FRESHMAN : return "freshman"; 
		case SOPHOMORE : return "sophomore"; 
		case JUNIOR : return "junior"; 
		case SENIOR : return "senior";
		default : return "Unknown"; 
		}
	}
	
	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}

