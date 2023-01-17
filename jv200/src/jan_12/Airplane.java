package jan_12;

public class Airplane implements Flyer {

	
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("비행기 : 이륙하기");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("비행기 : 착륙하기");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기 : 비행하기");
	}

}
