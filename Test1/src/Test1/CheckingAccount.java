package Test1;

import Test1.OverdraftException;

public class CheckingAccount extends Account {
	double overdraftProtection;
	
	public CheckingAccount(String accountNum, double balance, double overdraftProtection) {
		super(accountNum, balance);
		this.overdraftProtection = overdraftProtection;
	}

	public double getOverdraftProtection() {
		return overdraftProtection;
	}

	public void setOverdraftProtection(double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}
	@Override
	public void withdraw(double amount)	throws OverdraftException{
		if(balance - amount < 0) {
			double overdraftNeeded = amount -= balance;
			if(overdraftProtection < overdraftNeeded) {
			throw new OverdraftException("(한도액 초과 잔고) : " + balance);
			} else {
				balance = overdraftNeeded * -1.0;
				overdraftProtection = overdraftProtection - overdraftNeeded;
				System.out.println("잔여 대월액 : " + (overdraftProtection));
			}
		}else {
			balance -= amount;
			System.out.println("잔고 : " + balance);
		}
	}
}
