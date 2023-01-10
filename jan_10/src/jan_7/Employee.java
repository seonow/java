package jan_7;

public class Employee {
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
}
