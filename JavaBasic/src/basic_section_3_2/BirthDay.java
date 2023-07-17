package basic_section_3_2;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid = true;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void SetMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
			return ;
	}
	
		this.month = month;
}
	
	public int getYear() {
		return year;
	}
	public void SetYear(int year) {
		this.year = year;
	}
	
	public boolean isValid() {
		return isValid;
	}

	public void printThis() {
		System.out.println(this);
	}
}