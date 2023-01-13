package jan_12.banking.service;

public class AccountNumGenerate {
	public static String generateAccountNum() {
		int random1 = (int) Math.ceil(Math.random() * 10000);
		int random2 = (int) Math.ceil(Math.random() * 10000);

		
//		String r1 = Integer.toString(random1);
//		String r2 = Integer.toString(random2);
//		String r3 = Integer.toString(random3);
//		String r4 = Integer.toString(random4);
		
		return  String.format("%04d", random1) + "-" + 
				String.format("%04d", random2);
	}

	public static void main(String[] args) {
		String s = generateAccountNum();
		System.out.print(s);
	}
}
	