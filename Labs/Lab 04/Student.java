
public class Student extends Person{
	private static final String freshman="Freshman";
	private static final String sophomore="Sophomore";
	private static final String junior="Junior";
	private static final String senior="Senior";
	private String classStatus;
	
	public Student(String name, String status) {
		super(name);
		this.classStatus=status;
	}
	public String toString() {
		return String.format("Person, Student, Name: %s", getName());
	}
}
