package Test1;

import Test1.InsufficientBalanceException;

public class SavingAccount extends Account{
	private double interestRate;
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount <= balance) {
			this.balance -= amount;
		}
		else {
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
	}
}
