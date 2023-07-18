package basic_section5_5;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("핸들을 만지지 마십시오");
		
	}

	@Override
	public void stop() {
		System.out.println("자율 주행을 멈춥니다.");
		System.out.println("핸들을 만지지 마십시오");
		
	}

	@Override
	public void chargeOrfeul() {
		System.out.println("배터리 충전 중입니다.");
		
	}

	
}
