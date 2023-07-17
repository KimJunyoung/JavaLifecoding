package basic_section3_4;

public class Person {

	public static int serialNum = 1000;
	
	private int employeeId;
	private String employessName;
	private String department;
	
	
	public Person () {
		employeeId = ++serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployessName() {
		return employessName;
	}
	public void setEmployessName(String employessName) {
		this.employessName = employessName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
	
}
