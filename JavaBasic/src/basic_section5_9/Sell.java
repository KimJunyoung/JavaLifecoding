package basic_section5_9;

public interface Sell {

	 void sell();
	 
	 default void order() {
		 System.out.println("Seller order");
	 }
}
