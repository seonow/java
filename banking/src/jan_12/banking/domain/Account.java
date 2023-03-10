package jan_12.banking.domain;

import jan_12.banking.exception.InsufficientBalanceException;

public class Account {
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	
	public Account() {
		
	}
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	//입금
	public void deposite(double amount) {
		balance = balance + amount;
	}
	//출금
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(amount <= balance) {
			this.balance -= amount;
		}
		else {
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
	}

	//잔고조회
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	//고객설정
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	//계좌설정
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}
	
}
