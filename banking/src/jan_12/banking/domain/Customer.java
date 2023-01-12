package jan_12.banking.domain;

public class Customer {
	private String name;
	private String ssn;
	private String phoneNum;
	private String userId;
	private String passwd;
	private Account[] accounts = new Account[3];
	
	public Customer(String name, String ssn, String phoneNum, String userId, String passwd) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phoneNum = phoneNum;
		this.userId = userId;
		this.passwd = passwd;
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

	//고객이 가진 계좌 추가
	public void addAccount(Account account) {
		for(int i = 0 ; i < accounts.length ; i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
	}
	
}
