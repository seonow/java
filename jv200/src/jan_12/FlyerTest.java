package jan_12;

public class FlyerTest {
	public static void main(String[] args) {
		IronMan i = new IronMan();
		i.takeOff();
		i.fly();
		i.land();
		
		System.out.println();
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		System.out.println();
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		System.out.println();
		
		Flyer f = new IronMan();
		f.takeOff();
		f.fly();
		f.land();
		
		System.out.println();
		
		f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		System.out.println();
		
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
		
		System.out.println(f);
	}
}

