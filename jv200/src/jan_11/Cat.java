package jan_11;

public class Cat extends Animal {
	public Cat(String type) {
		this(type,  false);
	}
	public Cat(String type, boolean eatable) {
		super(type, eatable);
	}
	@Override
	public void makeSound() {
		System.out.println("냐옹냐옹");
	}
}
