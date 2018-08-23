/***
 * Exercise 11.3    Account----> Checking_Account
 * 						   ----> Saving_Account
 * 
 * 					Test_Account
 * 
 * 
 */
package Chapter_11_11_3;

public class Saving_Account extends Account {


	private static String getbalance;

	public Saving_Account() {
		super();
	}
	
	public Saving_Account(int id, double balance) {
		super(id, balance);
	}
	
	public void Withdraw(double amount) {
		if (amount < getbalance()) {
			setBalance(getbalance() - amount);
		}
		else
			System.out.println("account overdrawn transtaction rejected");
	}
	
	public String toString() {
		return super.toString();
		
	}
}

