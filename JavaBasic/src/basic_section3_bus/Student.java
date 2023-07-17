package basic_section3_bus;

public class Student {

	private String studentName ;
	private int money ;
	
	public Student (String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus (Bus bus) {
		bus.take();
		this.money -= 1000;
	}
	
	public void takeSubway (Subway sub) {
		sub.take();
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 "+ money + "원 입니다 ");
	}
}
