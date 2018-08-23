
/****  Exercise 11.2
 *     person ---> student
 *     		  ---> Employee ---> Faculty
 *     						---> Staff 
 *     				
 *  
 */

package CHAPTER_11_11_02;

public class Person {
	
	private String name;
	private String adress;
	private String phone_number;
	private String email_adress;
	
	Person(){
		this.name= "Smit";
		this.adress= "El Monte, Los Angeles";
		this.phone_number= "6264640186";
		this.email_adress= "theshreyaspatel@gmail.com";
	}
	
	Person(String name, String adress, String phone_number, String email_adress){
		this.name=name;
		this.adress=adress;
		this.phone_number=phone_number;
		this.email_adress=email_adress;
		
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setadress(String adress) {
		this.adress=adress;
	}
	
	public void setphone_number(String phone_number) {
		this.phone_number=phone_number;
	}
	public void setemail_adress(String email_adress) {
		this.email_adress=email_adress;
	}
	
	public String getname() {
		return name;
	}
	
	public String getadress() {
		return adress;
	}
	
	public String getphone_number() {
		return phone_number;
	}
	public String getemail_adress() {
		return email_adress;
	}
	public String toString() {
		
		return "name: " +name+ " adress: "+adress+ " phone_number: "+phone_number+" email_adress : "+email_adress;
		
	}
}
	