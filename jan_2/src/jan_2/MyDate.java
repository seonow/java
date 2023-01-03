package jan_2;

/**
  * 1.모든 클래스는 생성자를 가진다
  * 2.만약 작성자가 생성자를 명시적으로 지정해 주지 않으면 디폴트 생성자가 만들어진다
  * 	-디폴트 생성자는 아규먼트를 가지지 않는다.
  * 	-디폴트 생성자의 구현부는 비어있다.
  *
  */

public class MyDate {
	//UML방식으로 class를 그린다 클래스명 / 속성 / 메서드
	
	//Information Hiding
	//day입력시 32를 입력하면 오류가 난다
	//이러한 오류는 직접 입력을 허용해서이므로
	//메서드를 통해서 규칙을 정하여 직접접근을 막는다.
	//메서드를 이용하면 오류를 걸러낼 수 있다.
	//이렇게 day에 직접접근을 못하도록 막는것이 information hiding이다
	
	//캡슐화(Encapsulation)
	//클래스의 구체적인 implementation(구현, 처리방식)을 감춘다
	//사용자가 인터페이스를 사용하여 데이터를 접근하도록 강제한다
	//유지보수를 잘할 수 있게 만든다
	

	private int day;
	private int month;
	private int year;
	
	public MyDate() {
	}
	
	public MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public String getDetails() {
		return year + "-" + month + "-" + day;
	}
	
}
