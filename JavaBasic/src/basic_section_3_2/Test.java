package basic_section_3_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		BirthDay day = new BirthDay();
		day.SetYear(2023);
		day.SetMonth(51);
		day.setDay(2);
		
		System.out.println(day.isValid());
		System.out.println(day);
		day.printThis();

	}

}
