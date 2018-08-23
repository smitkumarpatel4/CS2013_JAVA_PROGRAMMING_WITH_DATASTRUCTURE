package CHAPTER_09_OBJECT_AND_CLASSES.copy;

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
	
	public void setannualInterestRate(double nair){
		annualInterestRate=nair;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac= new Account(1122,20000);
		
		ac.setannualInterestRate(4.5);
		
		ac.Withdraw(2500);
		
		ac.Deposite(3000);
		
		System.out.println( " Account id = "+ac.getid());
		System.out.println(" balance = "+ ac.balance +" \n monthly intrest = " +ac.getMonthlyInterest() + "\n this account created on "+ ac.dateCreated );

	}

}
