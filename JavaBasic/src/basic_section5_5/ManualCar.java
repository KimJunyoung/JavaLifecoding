package basic_section5_5;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("핸들을 조작하십시오.");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");
	}

	@Override
	public void chargeOrfeul() {
		System.out.println("기름 주유 중입니다.");
		
	}

	
}
