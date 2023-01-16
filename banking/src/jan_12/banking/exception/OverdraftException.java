package jan_12.banking.exception;

public class OverdraftException extends InsufficientBalanceException {
	public OverdraftException(String msg) {
		super(msg);
	}
}
