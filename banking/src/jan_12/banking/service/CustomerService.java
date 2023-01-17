package jan_12.banking.service;

import jan_12.banking.domain.Customer;
import jan_12.banking.exception.CustomerNotFoundException;

public interface CustomerService {
	/**
	 * 전달된 인자로 구성된 CUstomer 정보 추가
	 */
	
	Customer addCustomer(String name, String ssn, String phone);
	
	/**
	 * 전달된 인자로 구성된 Customer 정보 추가
	 */
	Customer addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn) throws CustomerNotFoundException;
}
