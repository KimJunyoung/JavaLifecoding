package basic_section5_5;

public class CarTest {

	public static void main(String[] args) {
	
		Car aiCar = new AiCar();
		aiCar.run();
		
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}
