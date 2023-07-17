package basic_section3_5;

public class School {
	
	private static School instance = new School();
	
	private School() {
		
	}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

}
