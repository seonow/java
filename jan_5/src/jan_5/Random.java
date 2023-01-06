package jan_5;

public class Random {
	public static void main(String[] args) {
//		int[] a = {1,1,1,1,1,1,1,2,2,2,4,4,4,4,5,5,6};
//		int r = (int)(Math.ceil(Math.random() * 17)-1);
//		System.out.println(r);
//		for(int i = 0 ; i < a.length; i++) {
//			if(i == r) {
//				System.out.println(a[i]);
//			}
//		}
		String[] a = new String[] {"A등급","B등급","C등급","D등급","E등급"};
		double r = Math.ceil(Math.random() * 1000);
		for(int i = 0 ; i < a.length; i++) {
			if(r == 1) {
				i = 0;
				System.out.println(a[i]);
				System.out.println(r);
				break;
			}
			else if((r>1) && (r <= 100)) {
				i = 1;
				System.out.println(a[i]);
				System.out.println(r);
				break;
			}
			else if((r>100) && (r<= 200)) {
				i = 2;
				System.out.println(a[i]);
				System.out.println(r);
				break;
			}
			else if((r>200) && (r <= 400)) {
				i = 3;
				System.out.println(a[i]);
				System.out.println(r);
				break;
			}
			else {
				i=4;
				System.out.println(a[i]);
				System.out.println(r);
				break;
			}
		}
	}
}
