package jan_4;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(22, 7, 1964);
		MyDate date2 = date;
		
		System.out.println(date == date2);
		
		date2 = new MyDate(22 ,7, 1964);
		System.out.println(date == date2);
		
		date = date2;
		//이렇게 되면 6번 line의 코드가 쓰레기코드가 된다. 값은 있지만 참조를 갖고있지 않기 때문에
		System.out.println(date == date2);
	}

}
