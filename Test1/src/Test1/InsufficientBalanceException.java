package Test1;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
