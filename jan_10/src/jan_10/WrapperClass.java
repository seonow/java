package jan_10;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Integer i2 = new Integer(i); //줄그어져있는 것은 과거에 이렇게 썼다
		int i3 = i2.intValue();
		//intValue 객체 내용값을 정수로 변환
		
		int i4 = new Integer(200);
		Integer i5 = i4;
		int i6 = i5;
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
	}

}
