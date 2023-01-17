package jan_4;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int result = num++;
		int a = 0;
		a = a + 100;
		System.out.println(a);
		System.out.println(num);
		System.out.println(result);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		double v6 = (float)v4;
		
		System.out.println("v6의값은" + v6);
		
		System.out.println(45 & 25);
		
		num = 3;
		result = ++num;
		System.out.println(num);
		System.out.println(result);
	}

}
