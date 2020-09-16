
public class Employee extends Person{
	
	private String office;
	private double salary;
	private String dateHired;
	
	public Employee(String name, String office, String dateHired, double salary) {
		super(name);
		this.office=office;
		this.dateHired=dateHired;
		this.salary=salary;
	}
	public String toString() {
		return String.format("Person, Employee, Name: %s", getName());
	}
}
