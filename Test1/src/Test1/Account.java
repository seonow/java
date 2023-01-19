package Test1;

public class Account {
	protected String accountNum;
	protected double balance;
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount <= balance) {
			this.balance -= amount;
		}
		else {
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
	}

}
