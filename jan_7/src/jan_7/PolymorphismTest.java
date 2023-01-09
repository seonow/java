package jan_7;

public class PolymorphismTest {

	public static void main(String[] args) {
		Product p = new NoteBook();
		p.setName("Apple MacBook Pro");
		p.setPrice(3500.0);
		//NoteBook의 사이즈(inch)는 어떻게?
		NoteBook n = (NoteBook) p;
		n.setInch(15.6);
		n.setWeight("1.8kg");
		System.out.println(p.getDetails());
		
		Product p2 = new SmartPhone();
		p2.setName("Samsung Gallaxy S22");
		p2.setPrice(110.0);
		
		SmartPhone s = (SmartPhone) p2;
		s.setOs("Android");
		s.setColor("red");
		
		System.out.println(p2.getDetails());
	}

}
