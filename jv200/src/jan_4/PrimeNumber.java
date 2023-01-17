package jan_4;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int m = 0;
		for(int i=2; i <= 1000; i++) {
			for(int j=2; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(i + "\t");
				m++;
			}
			count = 0;
		}
		System.out.println();
		System.out.println(m);
	}
}