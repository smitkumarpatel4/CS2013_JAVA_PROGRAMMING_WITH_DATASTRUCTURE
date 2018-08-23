
/****  Exercise 11.2
 *     person ---> student
 *     		  ---> Employee ---> Faculty
 *     						---> Staff 
 *     				
 *  
 */
package CHAPTER_11_11_02;

import java.util.Date;

public class Employee extends Person {
	
	private int office;
	private double salary;
	private Date dateHired;
	
	public Employee(String name, String address, String phone, 
		String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}
	
	public int getOffice() {
		return office;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getDateHired() {
		return dateHired;
	}
	
	public void setOffice(int office) {
		this.office = office;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDateHired() {
		dateHired = new Date();
	}
	
	public String toString() {
		return super.toString() + "\nOffice: " + office +"\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}