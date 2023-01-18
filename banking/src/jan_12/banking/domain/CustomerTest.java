package jan_12.banking.domain;

import jan_12.banking.service.AccountNumGenerate;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer("서현재", "950209-1000000", "010-6549-0000", "stank1", "0000");
		
//		Account account = new Account(1000.0);
		
		Account account = new SavingsAccount(AccountNumGenerate.generateAccountNum(), 1000, 0.02);
		customer.addAccount(account);
		
		account = new CheckingAccount(AccountNumGenerate.generateAccountNum(), 1000, 1000);
		
		for(Account act : customer.getAccounts()) {
			System.out.println(act);
		}
	}
}