import java.util.Date;

public class Staff extends Employee{

	private String title;
	
	public Staff(String name,String title, String office, Date dateHired, double salary) {
		super(name, office, dateHired, salary);
		this.title=title;
	}
	public String toString() {
		return String.format("%s, Name: %s", getClass().getSimpleName() , getName());
	}
}
