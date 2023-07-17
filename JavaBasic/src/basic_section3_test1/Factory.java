package basic_section3_test1;

public class Factory {

	private static Factory instance = new Factory();
	
	
	private Factory () {
		
	}
	
	public static Factory getInstance() {
		if(instance == null) {
			Factory instance = new Factory();
		}
		
		return instance;
	}
	
	public Car createCar() {
		 Car car = new Car();
		 return car;
	}
	
	
}
