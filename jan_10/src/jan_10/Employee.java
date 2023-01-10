package jan_10;

public class Employee extends Object {
	protected String name;
	protected double salary;
	protected MyDate birthDate;
	
//	public Employee() {
//		
//	}
	
	public Employee(String name, double salary, MyDate birthDate) {
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	
	public String getDetails() {
		return "Name : " + name + "\nSalary: " + salary + "\nBirthDate: " + birthDate.getDetails();
	}
	@Override
	public String toString() {
		return "Name : " + name + "\nSalary: " + salary + "\nBirthDate: " + birthDate.getDetails();
	}
	

//	@Override
//	public boolean equals(Object obj){
//		if(obj instanceof Employee) {
//			Employee e = (Employee)obj;
//			if(this.name == e.name)) {
//				if(this.salary == e.salary) {
//					if(this.birthDate == e.birthDate) {
//						return true;
//					}
//					else {
//						return false;
//					}
//				}else {
//					return false;
//				}
//			}else {
//				return false;
//			}
//		}else {
//			return false;
//		}
//	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			if(e.name.equals(this.name) && e.salary == this.salary && e.birthDate.equals(this.birthDate)) {
				return true;
			}
		}
			return false;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("유비", 1000.0, new MyDate(10, 5, 2000));
		Employee e2 = new Employee("유비", 1000.0, new MyDate(10, 5, 2000));
		
//		if(e.equals(e2)) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		System.out.println(e.equals(e2));
		
		System.out.println(e);
	}
}
