import java.util.Date;

public class Faculty extends Employee{

	private String officeHours;
	private String rank;
	
	public Faculty(String name, String officeHours, String rank, String office, Date dateHired, double salary) {
		super(name, office, dateHired, salary);
		this.officeHours=officeHours;
		this.rank=rank;
	}
	public String toString() {
		return String.format("%s, Name: %s", getClass().getSimpleName() , getName());
	}
}
