package jan_12.banking.domain;

public class SavingsAccount extends Account{
	double interestRate;
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
