/***
 * Exercise 11.3    Account----> Checking_Account
 * 						   ----> Saving_Account
 * 
 * 					Test_Account
 * 
 * 
 */

package Chapter_11_11_3;

public class Test_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000);
		Saving_Account savings = new Saving_Account(1001, 20000);
		Checking_Account checking = new Checking_Account(1004, 20000, -100);
		
		
		account.setannualInterestRate(4.5);
		savings.setannualInterestRate(4.5);
		checking.setannualInterestRate(4.5);

		
		account.Withdraw(3000);
		savings.Withdraw(5000);
		checking.Withdraw(2000);

		
		account.Deposite(3000);
		savings.Deposite(3000);
		checking.Deposite(30);

		
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}

}
