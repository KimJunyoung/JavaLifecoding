package basic_section5_10;

public class Test {

	public static void main(String[] args) {
		Queue bookQue = new BookShelf();
		bookQue.enQueue("태백산맥1");
		bookQue.enQueue("태백산맥2");
		bookQue.enQueue("태백산맥3");
	
		System.out.println(bookQue.deQueue());
		System.out.println(bookQue.deQueue());
		System.out.println(bookQue.deQueue());
	}
	

}
