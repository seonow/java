package jan_11;

public class Count2 {
	public static int counter = 0;
	public int serialNum;
	
	public Count2() {
		counter++;
		serialNum = counter;
	}
	//현재 메모리에 객체가 몇개 인지 알 수 있는 코드

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
		Count2[] c = new Count2[10];
		for(int i = 0 ; i < c.length ; i++) {
			c[i] = new Count2();
		}
		for(Count2 c1 : c) {
			System.out.println(c1);
		}
	}
}
