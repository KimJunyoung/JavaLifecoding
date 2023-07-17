package basic_section3_test3;

import java.util.*;

public class Student {

	private String studentName;
	private int studentNum;
	ArrayList<Subject> subjectList ;
	
	public Student(String studentName, int studentNum) {
		this.studentName = studentName;
		this.studentNum = studentNum;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int sum = 0;
		
		for(int i=0; i<subjectList.size(); i++) {
			sum += subjectList.get(i).getSubjectScore();
			System.out.println("주소?:"+ subjectList.get(i));
			System.out.println("학생" + studentName + "의 " + 
			subjectList.get(i).getSubjectName() + "성적은: " + subjectList.get(i).getSubjectScore() );
		}
		
		System.out.println("학생" + studentName + "의 총점은" + sum + "입니다");
	}
	
	
	
}
