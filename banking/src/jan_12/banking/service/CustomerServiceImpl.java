package jan_12.banking.service;

import java.util.HashMap;
import java.util.Map;

import jan_12.banking.domain.Customer;
import jan_12.banking.exception.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {
	private static final Map<String, Customer> BANK_CUSTOMERS = new HashMap<>();

	@Override
	public Customer addCustomer(String name, String ssn, String phoneNum) {
		Customer customer = new Customer(name, ssn, phoneNum);
		return addCustomer(customer);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		BANK_CUSTOMERS.put(customer.getSsn(), customer);
		return customer;
	}

	@Override
	public Customer getCustomerBySsn(String ssn) throws CustomerNotFoundException {
		if(BANK_CUSTOMERS.containsKey(ssn)) {
			return BANK_CUSTOMERS.get(ssn);
		}
		throw new CustomerNotFoundException(ssn + " customer does not exist.");
	}

}
