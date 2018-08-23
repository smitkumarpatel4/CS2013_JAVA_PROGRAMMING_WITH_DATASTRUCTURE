package CHAPTER_12_EXCEPTION_HANDLING_AND_TEXT_IO;
public class Exercise_12_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        try {
	            Loan loan = new Loan(0,10,1000);
	        } catch (IllegalArgumentException ex) {
	            System.out.println("IllegalArgumentException: " + ex.getMessage());
	        }
	    }

	}

	class Loan {
	    private double annualInterestRate;
	    private int numberOfYears;
	    private double loanAmount;
	    private java.util.Date loanDate;

	    
	    public Loan() {
	        this(2.5, 1, 1000);
	    }
	    
	    public Loan(double annualInterestRate, int numberOfYears,double loanAmount) {
	        if (loanAmount <= 0)
	            throw new IllegalArgumentException("loanAmount is greater than 0.");
	        if (annualInterestRate <= 0)
	            throw new IllegalArgumentException("annualInterestRate is greater than 0.");
	        if (numberOfYears <= 0)
	            throw new IllegalArgumentException("numberOfYears is greater than 0.");

	        this.annualInterestRate = annualInterestRate;
	        this.numberOfYears = numberOfYears;
	        this.loanAmount = loanAmount;
	        loanDate = new java.util.Date();
	    }

	    public double getAnnualInterestRate() {
	        return annualInterestRate;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	        if (annualInterestRate <= 0)
	            throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
	        this.annualInterestRate = annualInterestRate;
	    }

	    public int getNumberOfYears() {
	        return numberOfYears;
	    }

	    public void setNumberOfYears(int numberOfYears) {
	        if (numberOfYears <= 0)
	            throw new IllegalArgumentException("numberOfYears must be greater than 0.");
	        this.numberOfYears = numberOfYears;
	    }

	    public double getLoanAmount() {
	        return loanAmount;
	    }

	    public void setLoanAmount(double loanAmount) {
	        if (loanAmount <= 0)
	            throw new IllegalArgumentException("loanAmount must be greater than 0.");
	        this.loanAmount = loanAmount;
	    }

	    public double getMonthlyPayment() {
	        double monthlyInterestRate = annualInterestRate / 1200;
	        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
	        return monthlyPayment;
	    }

	    public double getTotalPayment() {
	        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
	        return totalPayment;
	    }
	    
	    public java.util.Date getLoanDate() {
		    return loanDate;
		    }
}
