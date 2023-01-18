package jan_12.banking.service;

import jan_12.banking.domain.Account;
import jan_12.banking.exception.AccountNotFoundException;

public interface AccountService {

	Account addAccount(String accountNum, String ssn,double balance);
	
	Account addAccount(Account account);
	Account getAccountBySsn(String ssn) throws AccountNotFoundException;
}
