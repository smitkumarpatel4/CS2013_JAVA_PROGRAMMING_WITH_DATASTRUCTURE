/****  Exercise 11.2
 *     person ---> student
 *     		  ---> Employee ---> Faculty
 *     						---> Staff 
 *     				
 *  
 */
package CHAPTER_11_11_02;

public class Faculty extends Employee {
	
	private double officeHours;
	private int rank;
	
	public Faculty(String name, String address, String phone, String email,int office, double salary, double officeHours,int rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public double getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +"\nRank: " + rank;
	}
}