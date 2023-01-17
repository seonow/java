package jan_7;

public class Manager extends Employee{
	protected String department;
	
	public Manager(String name, double salary, MyDate birthDate, String dept) {
		super(name, salary, birthDate); 
		this.department = dept;
//		public Employee(String name, double salary, MyDate birthDate) {
//			this.name = name;
//			this.salary = salary;
//			this.birthDate = birthDate;
//		}
//		을 콜 한 것이다
//		생성자의 첫번째는 무조건 super를 적어야 한다 안적으면 super()를 적용한다 = 디폴트 생성자를 불러온다

	}
	@Override 
	//컴파일러가 보는 주석
	public String getDetails() {
		return super.getDetails() + "\ndepartment: " + department;
	}
	
	public static void main(String[] args) {
		Manager m = new Manager("현재", 3000.0, new MyDate(10, 5, 2000), "영업");
		String info = m.getDetails();
		System.out.println(info);
		System.out.println("--------------------------");
		Employee e = new Employee ("관우", 2000.0, new MyDate(22, 8, 2001));
		info = e.getDetails();
		System.out.println(info);
	}
}
