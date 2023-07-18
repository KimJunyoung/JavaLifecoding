package basic_section5_1;

public class GoldCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
	public GoldCustomer (int customerId, String customerName) {
		super(customerId,customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "상담원 아이디는 " + agentID;
	}
	
	
}
