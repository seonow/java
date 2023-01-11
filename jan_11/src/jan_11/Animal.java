package jan_11;

public abstract class Animal {
	protected String type;
	protected boolean eatable;
	
	public Animal(String type) {
		this(type, false);
		
	}
	public Animal(String type, boolean eatable) {
		this.type = type;
		this.eatable = eatable;
	}
	public abstract void makeSound();	//추상메서드
	
	public static void main(String[] args) {
//		Animal a = new Animal("포유류", false);
//		추상클래스는 객체 생성 불가
		Animal d = new Dog("포유류", true);
		d.makeSound();
	}
}
