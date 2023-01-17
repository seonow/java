package jan_12.banking.service;

import jan_12.banking.domain.Customer;

public class CustomerServieTest {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		service.addCustomer("서현재", "950209-1000000", "010-6549-0000");
		service.addCustomer("관우", "950319-1000000", "010-6009-0000");
		service.addCustomer("황충", "880205-1000000", "010-0202-0505");
			
		Customer customer = service.getCustomerBySsn("950209-1000000");
		System.out.println(customer);
	}
}
