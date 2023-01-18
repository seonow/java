package jan_12.banking.service;

import jan_12.banking.domain.Customer;

public class CustomerServiceTest {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
			service.addCustomer("유비","900000-1000000","010-1212-1212");
			service.addCustomer("황충","900000-1100000","010-1212-2323");
			service.addCustomer("하후돈","900000-1200000","010-1212-3434");
			service.addCustomer("방통","900000-1300000","010-1212-4545");
		
			Customer customer = service.getCustomerBySsn("900000-1000000");
			System.out.println(customer);
		
		
	}
}
