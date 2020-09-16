
public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p= new Person("Abudllah", "Dammam", 1123, "abd@gmail.com");
		Employee em= new Employee("Jassem", null, null, 0);
		Student st= new Student("Ahmed", null);
		Faculty fa= new Faculty("Mohammed", null, null, null, null, 0);
		Staff s= new Staff("Ali", null, null, null, 0);
		
		System.out.println(p.toString());
		System.out.println(em.toString());
		System.out.println(st.toString());
		System.out.println(fa.toString());
		System.out.println(s.toString());

	}

}
