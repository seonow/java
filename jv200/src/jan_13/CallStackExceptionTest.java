package jan_13;

public class CallStackExceptionTest {
	public void a() throws Exception {
		b();
	}
	public void b() throws Exception {
		c();
	}
	public void c() throws Exception {
		System.out.println("c() is called.");
		throw new Exception("매우 위험하고 대단하고 막강한 에러");
	}
	//위와 같이 되면 이놈을 부른 놈이 처리해야한다. main이 될 것이다.
	public static void main(String[] args) {
		CallStackExceptionTest test = new CallStackExceptionTest();
		try {
			test.a();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
