/***
 *   Exercise 11.6   Circle   Loan    Test_Exercise_11_6
 */
package Chapter_11_11_6;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	
	public Loan() {
		this.annualInterestRate = 5;
		this.numberOfYears = 10;
		this.loanAmount = 10000;
		loanDate = new java.util.Date();
	}

	public Loan(double annualInterestRate, int numberOfYears,double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	
	public void setAnnualInterestRate(double air) {
		this.annualInterestRate = air;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int noy) {
		this.numberOfYears = noy;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	} 

	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}
	
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	public String toString() {		
	return " annualInterestRate: " +annualInterestRate+ " numberOfYears: "+ numberOfYears +" Ammount: " + loanAmount +" Date: "+ loanDate;
	}
}
