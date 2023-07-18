package basic_section5_8;

public class CalcTest {

	public static void main(String[] args) {
	
	  Calc calc = new CompleteCalc();
	  calc.add(1, 2);
	  
	 calc.description();

	 int[] arr = {1,2,3,4};
	 int total = Calc.total(arr);
	 System.out.println(total); // static 은 클래스에 선언.. 그래서 인스턴스 생성 될떄마다 값은 동일..
	}

}
