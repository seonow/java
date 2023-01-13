package jan_13;

/**
 * java AddArguments 1 2 3 4
 * 
 * @author "Seonow"
 *
 */

public class AddArguments {
	public static void main(String[] args) {
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("sum = " + sum);
	}
}
