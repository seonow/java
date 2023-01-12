package jan_12;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("새 : 이륙하기");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("새 : 착륙하기");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("새 : 비행하기");
	}

}
