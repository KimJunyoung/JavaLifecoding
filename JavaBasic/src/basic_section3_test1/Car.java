package basic_section3_test1;

public class Car {
	
	private static int carNum = 10001;
	private int ownNum ;
	public Car() {
		carNum++;
		ownNum = carNum;
	}
	

	public int getCarNum() {
		return ownNum;
	}
	
}
