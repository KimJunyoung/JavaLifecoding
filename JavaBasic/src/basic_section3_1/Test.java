package basic_section3_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int leeSum = 0;
		int kimSum = 0;
		
		Student Lee = new Student(1, "Lee");
		Lee.setKoreanSubject(100);
		Lee.setMathSubject(95);

		
		Student Kim = new Student(2, "Kim");	
		Kim.korean.score = 80;
		Kim.math.score = 99;
		
		
		leeSum = Lee.korean.score + Lee.math.score;
		kimSum = Kim.korean.score + Kim.math.score;
		
		System.out.println(leeSum);
		System.out.println(kimSum);
		
		
	}

}
