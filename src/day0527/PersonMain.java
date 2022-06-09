package day0527;

class Person {
	final String SSN;
	final String NATION = "korea";
	String name;
	
	public Person(String SSN, String name) {
		this.SSN = SSN;
		this.name = name;
	}
	
}

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "김그린");
		System.out.println(p1.SSN);
		System.out.println(p1.NATION);
		System.out.println(p1.name);

		
	}

}
