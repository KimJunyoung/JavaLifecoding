package basic_section3_4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		person1.setEmployessName("김준영");
		
		System.out.println(Person.serialNum); // Static 변수는 클래스 생성전에 만들어지기 때문에 Class.serialNum
		
		Person person2 = new Person();
		person2.setEmployessName("이한준");
		
		
		System.out.println(Person.serialNum);
		System.out.println(Person.serialNum);
		

	}

}
