package Test1;

public class AccountTest {
	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount(AccountNumGenerate.generateAccountNum(),10000.0,0.3);
		CheckingAccount ca = new CheckingAccount(AccountNumGenerate.generateAccountNum(),10000.0,3000.0);
		
		System.out.println("SavingAccount의 계좌번호는 " + sa.getAccountNum() + "입니다");
		try {
			sa.withdraw(11000.0);
		}catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
		System.out.println("CheckingAccount의 계좌번호는 " + ca.getAccountNum() + "입니다");	
		try {
			ca.withdraw(14000.0);
		}catch(OverdraftException e) {
			e.printStackTrace();
		}
	}
}
