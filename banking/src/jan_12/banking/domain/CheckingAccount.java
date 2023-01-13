package jan_12.banking.domain;

public class CheckingAccount extends Account{
	double overdraftProtection;
	
	public CheckingAccount(String accountNum, double balance, double overdraftProtection) {
		super(accountNum, balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	public void setOverdraftProtection(double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}
	public double getOverdraftProtection() {
		return this.overdraftProtection;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount <= balance) {
			this.balance -= amount;
			System.out.println(amount + "원을 출금합니다");
			System.out.println("현재 잔액은 " + balance + "원 입니다");
		}
		else {
			if(amount <= balance + overdraftProtection) {
				System.out.println((amount - balance) + "원 대출합니다.");
				this.balance -= amount;
				System.out.println(amount + "원을 출금합니다");
				System.out.println("현재 잔액은 " + balance + "원 입니다");
			}
			else {
				System.out.println("희망 출금액 : " + amount + "원");
				System.out.println("가능한 대출금은 " + overdraftProtection + "원 입니다.");
				System.out.println("잔액이 부족합니다. 최대출금가능액은 " + (balance + overdraftProtection) + " 원 입니다.");
			}
		}
	}
	
}