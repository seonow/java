package jan_12.banking.service;

import jan_12.banking.domain.Account;

public class AccountNumGenerate {
	public static void main(String[] args) {
		Account account = new Account(300.0);
		
		int random1 = (int) Math.ceil(Math.random() * 10000);
		int random2 = (int) Math.ceil(Math.random() * 100);
		int random3 = (int) Math.ceil(Math.random() * 1000);
		int random4 = (int) Math.ceil(Math.random() * 10000);
		String r1 = Integer.toString(random1);
		String r2 = Integer.toString(random2);
		String r3 = Integer.toString(random3);
		String r4 = Integer.toString(random4);
		System.out.println(r1 + "-" + r2 + "-" + r3 + "-" + r4);
	}
}
