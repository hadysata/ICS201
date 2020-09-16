import java.util.Date;

public class Employee extends Person{
	
	private String office;
	private double salary;
	private Date dateHired;
	
	public Employee(String name, String office, Date dateHired, double salary) {
		super(name);
		this.office=office;
		this.dateHired=dateHired;
		this.salary=salary;
	}
	public String toString() {
		return String.format("%s, Name: %s", getClass().getSimpleName() , getName());
	}
}
