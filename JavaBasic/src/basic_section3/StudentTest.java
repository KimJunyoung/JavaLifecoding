package basic_section3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student = new Student(13, "준영"); // 인스턴스 생성  
		
		student.address = "남구";
		student.showStudentInfo();
		
		System.out.println(student); // student 는 참조변수 (변수에 주소값을 저장)
	}

}
