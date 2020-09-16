
public class Staff extends Employee{

	private String title;
	
	public Staff(String name,String title, String office, String dateHired, double salary) {
		super(name, office, dateHired, salary);
		this.title=title;
	}
	public String toString() {
		return String.format("Person, Employee, Staff, Name: %s", getName());
	}
}
