package jan_12.banking.domain;

import jan_12.banking.exception.OverdraftException;
import jan_12.banking.service.AccountNumGenerate;

public class AccountTest {
	public static void main(String[] args) {
		CheckingAccount check = new CheckingAccount(AccountNumGenerate.generateAccountNum(),10000.0,3000.0);
		Customer customer = new Customer("서현재", "950209-1000000", "010-6549-0000", "stank1", "0000");
				

		System.out.println(customer.getName() + "님의 계좌는 " + check.getAccountNum() + "입니다");
		System.out.println("현재 잔액은 " + check.getBalance() + "원 입니다");
		try {
			check.withdraw(14000.0);
		} catch (OverdraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
}
