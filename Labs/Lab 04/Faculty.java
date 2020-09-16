
public class Faculty extends Employee{

	private String officeHours;
	private String rank;
	
	public Faculty(String name, String officeHours, String rank, String office, String dateHired, double salary) {
		super(name, office, dateHired, salary);
		this.officeHours=officeHours;
		this.rank=rank;
	}
	public String toString() {
		return String.format("Person, Employee, Faculty, Name: %s", getName());
	}
}
