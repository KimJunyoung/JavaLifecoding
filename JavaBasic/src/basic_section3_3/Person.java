package basic_section3_3;

public class Person {

	private String name ;
	private int age;
	
	public Person() {
		this("이름없다",1);

	};
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person[] personArray = {new Person(), new Person(), new Person()};
		
		String[] stringArray = {" 12 ", new String(), new String()};
		
		System.out.println(stringArray[0]);
		
	}
}
