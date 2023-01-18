package jan_12.banking.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Customer {
	private String name;
	private String ssn;
	private String phoneNum;
	private String userId;
	private String passwd;
	
	private List<Account> accounts = new ArrayList<>();
	
	public Customer(String name, String ssn, String phoneNum) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phoneNum = phoneNum;
	}
	
	public Customer(String name, String ssn, String phoneNum, String userId, String passwd) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phoneNum = phoneNum;
		this.userId = userId;
		this.passwd = passwd;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String toString() {
		return this.name + "\t" + this.ssn + "\t" + this.phoneNum;
	}
	//고객이 가진 계좌 추가
	public void addAccount(Account account) {
		boolean duplicated = false;
		for(Account act : accounts) {
			if(act.getAccountNum().equals(account.getAccountNum())) {
				duplicated = true;
				break;
			}
		}
		if(!duplicated) {
			accounts.add(account);
		}
//		for(int i = 0 ; i < accounts.length ; i++) {
//			if(accounts[i] == null) {
//				accounts[i] = account;
//				break;
//			}
//		}
	}
}
