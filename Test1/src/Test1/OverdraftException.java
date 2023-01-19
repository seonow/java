package Test1;

public class OverdraftException extends InsufficientBalanceException{
	public OverdraftException(String msg) {
		super(msg);
	}
}
