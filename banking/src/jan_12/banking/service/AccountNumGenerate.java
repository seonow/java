package jan_12.banking.service;

public class AccountNumGenerate {
	public static String generateAccounNum() {
		int random1 = (int) Math.ceil(Math.random() * 10000);
		int random2 = (int) Math.ceil(Math.random() * 100);
		int random3 = (int) Math.ceil(Math.random() * 1000);
		int random4 = (int) Math.ceil(Math.random() * 10000);
		
//		String r1 = Integer.toString(random1);
//		String r2 = Integer.toString(random2);
//		String r3 = Integer.toString(random3);
//		String r4 = Integer.toString(random4);
		
		return  String.format("%04d", random1) + "-" + 
				String.format("%02d", random2) + "-" + 
				String.format("%03d", random3) + "-" +
				String.format("%04d", random4);
	}

	public static void main(String[] args) {
		String s = generateAccounNum();
		System.out.print(s);
	}
}
	