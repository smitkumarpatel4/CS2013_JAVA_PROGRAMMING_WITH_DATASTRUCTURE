/****
 *    Exercise 11.8  Account Transaction Test_Exersices_11_11_8
 */

package Chapter_11_11_8;

public class Test_Exersices_11_11_8 {
			
		public static void main(String[] args) {
			
			Account account = new Account("George", 1122, 1000.0);

			
			account.setAnnualInterestRate(1.5);

			
			account.deposit(30);
			account.deposit(40);
			account.deposit(50);

			
			account.withdraw(5);
			account.withdraw(4);
			account.withdraw(2);

			System.out.println("       Account Summary"); 
			System.out.println("_____________________________________________________");
			System.out.println("name: " + account.getName());
			System.out.println("Interest rate: " + account.getAnnualInterestRate());
			System.out.printf("Balance: $%.2f\n", account.getBalance());
			
			
			System.out.println("     List of transactions");
			System.out.println("_____________________________________________________");
			for (int i = 0; i < account.getTransactions().size(); i++) {
				System.out.println("Date: " +(account.getTransactions()).get(i).getDate());
				System.out.println("Type: " +(account.getTransactions()).get(i).getType());
				System.out.println("Amount: " +(account.getTransactions()).get(i).getAmount());
				System.out.println("Balance: " +(account.getTransactions()).get(i).getBalance());
				System.out.println("Description: " +(account.getTransactions()).get(i).getDescription());
				System.out.println();
			}
		}

}
