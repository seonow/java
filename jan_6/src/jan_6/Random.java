package jan_6;

public class Random {
		public static void main(String[] args) {
			int[] a = {1,1,1,1,1,1,1,2,2,2,4,4,4,4,5,5,6};
			int r = (int)(Math.ceil(Math.random() * 16));

			for(int i = 0 ; i < a.length; i++) {
				if(i == r) {
					System.out.println(a[i]);
				}
			}
		}
	}

