/***
 * Exercise 11.3    Account----> Checking_Account
 * 						   ----> Saving_Account
 * 
 * 					Test_Account
 * 
 * 
 */
package Chapter_11_11_3;

import java.util.Date;

    public class Account {
		private int id;
		private double balance;
		private static double annualInterestRate;
		private Date dateCreated;
	
	Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated =new Date();
	}
	
	Account(int i, double ib){
		id=i;
		balance= ib;
		dateCreated= new Date();
	}
	
	public void setid(int nid) {
		id=nid;
	}
	
	public void setannualInterestRate(double air){
		annualInterestRate=air;
	}
	
	public void setBalance(double nb){
		balance=nb;
	}
	
	public int getid() {
		return id;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDate(){
		return dateCreated.toString();
		}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
		}
	
	public double getMonthlyInterest() {
		return balance*(getMonthlyInterestRate()/100);
	}
	
	public void Withdraw(double w) {
		balance = balance-w;
	}
	
	public void Deposite(double d) {
		balance = balance+d;
	}
	public String toString() {
		return " Id: " +id +" balance : "+balance  + " DateCreated: " +dateCreated;
	}

}
