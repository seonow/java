package jan_11;

public class Count1 {
	public static int counter = 0;
	public int serialNum;
	
	public Count1() {
		counter++;
		serialNum = counter;
	}
	//현재 메모리에 객체가 몇개 인지 알 수 있는 코드

	public String toString() {
		return "Count : " + serialNum + "/" + counter;
	}
	
	public static void main(String[] args) {
		Count1[] c = new Count1[10];
		for(int i = 0 ; i < c.length ; i++) {
			c[i] = new Count1();
		}
		for(Count1 c1 : c) {
			System.out.println(c1);
		}
	}
}
