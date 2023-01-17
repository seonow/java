package jan_11;

public class Count3 {
	public static int counter = 0;
	public int serialNum;
	
	public Count3() {
		counter++;
		serialNum = counter;
	}
	//현재 메모리에 객체가 몇개 인지 알 수 있는 코드

	static {
		System.out.println("static initializer called");
	}	
	
	public String toString() {
		return "Count : " + getSerialNum() + "/" + getTotalCount();
	}
	
	public static int getTotalCount() {
		return counter;
	}
	public int getSerialNum() {
		return serialNum;
	}//static 메서드가 있을 때 instance는 안 만들어 졌다.
	//serialNum은 instance변수
	
	public static void main(String[] args) {
		Count3[] c = new Count3[10];
		for(int i = 0 ; i < c.length ; i++) {
			c[i] = new Count3();
		}
		for(Count3 c1 : c) {
			System.out.println(c1);
		}
	}
}
