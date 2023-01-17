package jan_10;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook noteBook = new NoteBook();
		noteBook.setName("Apple MacBook pro");
		noteBook.setInch(15.5);
		noteBook.setPrice(3500.0);
		
		NoteBook noteBook2 = new NoteBook();
		noteBook2.setName("Apple MacBook pro");
		noteBook2.setInch(15.5);
		noteBook2.setPrice(3500.0);
		
		if(noteBook == noteBook2) {
			System.out.println("equals is true");
		}
		else {
			System.out.println("equals is false");
		}
		if(noteBook.equals(noteBook2)) {
			System.out.println("equals is true");
		}
		else {
			System.out.println("equals is false");
		}
		System.out.println("===============================");
		String str = new String("유비");
		String str2 = new String("유비");
		
		if(str == str2) {
			System.out.println("equals is true");
		}
		else {
			System.out.println("equals is false");
		}
		if(str.equals(str2)) {
			System.out.println("equals is true");
		}
		else {
			System.out.println("equals is false");
		}
		System.out.println("===============================");
		String str3 = "유비";
		String str4 = "유비";
		
		if(str3 == str4) {
			System.out.println("equals is true");
		}
		else {
			System.out.println("equals is false");
		}
		if(str3.equals(str4)) {
			System.out.println("equals is true");
		}
		else {
			System.out.println("equals is false");
		}
	}

}
