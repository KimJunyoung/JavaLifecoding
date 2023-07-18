package basic_section5_9;

public interface Buy {
	
	 void buy();
	 
	 default void order() {
		 System.out.println("buyer order");
	 }
	
}
