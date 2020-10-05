package Labs.Lab04.src;

public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return String.format("%s, Name: %s", getClass().getSimpleName(), getName());
	}

}
