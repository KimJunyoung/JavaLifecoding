package basic_section5_9;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		Buy.super.order();
	}

}
