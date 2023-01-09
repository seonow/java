package jan_7;

public class PolymorphismTest {

	public static void main(String[] args) {
		Product p = new NoteBook();
		p.setName("Apple MacBook Pro");
		p.setPrice(3500.0);
		//NoteBook의 사이즈(inch)는 어떻게?
		NoteBook n = (NoteBook) p;
		n.setInch(15.6);
		
		System.out.println(p.getDetails());
	}

}
