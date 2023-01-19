package Test1;

public class AccountNumGenerate {
	public static String generateAccountNum() {
		int random1 = (int) Math.ceil(Math.random()* 10000);
		int random2 = (int) Math.ceil(Math.random()* 10000);
		
		return  String.format("%04d", random1) + "-" + 
				String.format("%04d", random2);
	}
}
