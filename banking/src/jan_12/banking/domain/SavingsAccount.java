package jan_12.banking.domain;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	public SavingsAccount(double balance, double rate) {
		super(balance);
		setInterestRate(rate);
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
