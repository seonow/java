package jan_12.banking.domain;

import jan_12.banking.service.AccountNumGenerate;

public class AccountTest {
	public static void main(String[] args) {
		CheckingAccount check = new CheckingAccount(AccountNumGenerate.generateAccountNum(),10000.0,3000.0);
		Customer customer = new Customer("서현재", "950209-1451018", "010-6549-8474", "stank1", "ss6427");
				

		System.out.println(customer.getName() + "님의 계좌는 " + check.getAccountNum() + "입니다");
		System.out.println("현재 잔액은 " + check.getBalance() + "원 입니다");
		check.withdraw(2000.0);

	}
		
}
