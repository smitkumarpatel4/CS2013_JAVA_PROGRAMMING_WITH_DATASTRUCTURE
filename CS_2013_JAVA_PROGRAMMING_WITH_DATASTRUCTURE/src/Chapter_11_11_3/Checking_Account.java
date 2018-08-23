/***
 * Exercise 11.3    Account----> Checking_Account
 * 						   ----> Saving_Account
 * 
 * 					Test_Account
 * 
 * 
 */
package Chapter_11_11_3;

public class Checking_Account extends Account {
	
	private double overdraftLimit;
	
	public Checking_Account() {
		super();
		overdraftLimit = -20;
	}
	
		public Checking_Account(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void Withdraw(double amount) {
		if (getbalance() - amount > overdraftLimit) {
			setBalance(getbalance() - amount);
		}
		else
			System.out.println("Amount exceeds overdraft limit.");
	}
	
	public String toString() {
	return super.toString() + "\n Overdraft limit: $" +overdraftLimit;
	}

}
