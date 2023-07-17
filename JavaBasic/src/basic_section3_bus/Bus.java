package basic_section3_bus;

public class Bus {

	private int busNum ;
	private int earnMoney;
	private int count;
	private int cost = 1000;
	
	public Bus(int busNum) {
		this.busNum = busNum;
		this.earnMoney = 0;
		this.count = 0;
	}
	
	public void take() {
		this.earnMoney += this.cost;
		this.count += 1;
	}
	
	public void showBusInfo() {
		System.out.println(busNum + "번 버스의 승객은" + count + "명 이고" + ",수입은 " + earnMoney + "원 입니다.");
	}
	
	
}
