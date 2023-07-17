package basic_section3;

public class Student {

	public int studentID;  // 멤버변수이자 인스턴스 생성시 인스턴스 변수라고도 한다.
	public String studentName;
	public String address;
	
	public Student() {};
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
