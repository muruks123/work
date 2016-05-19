package java8tests;

public class Person {
 
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String fn, String ln, int age){
		this.firstName=fn;
		this.lastName=ln;
		this.age=age;
	}

	public String getFirstName() {
		return firstName;
	}

	

	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}

	
	
}
