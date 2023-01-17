package jan_12.banking.exception;

public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
