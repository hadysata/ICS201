import java.util.Date;

public class Helper {

	public static void main(String[] args) {
		
		Date date = new Date();

		Person person= new Person("Hady", "Khobar", "+966507123433", "hadysata@gmail.com");
		Employee employee= new Employee("Ali", "Office-A", date, 10000);
		Student student= new Student("Fahad", "Good");
		Faculty faculty = new Faculty("Mohammed", "5PM-9PM", "5th", "Office-H", date, 2000);
		Staff staff= new Staff("Mohammed", "CTO", "Office-B", date, 140000);
		
		System.out.println(person.toString());
		System.out.println(employee.toString());
		System.out.println(student.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
