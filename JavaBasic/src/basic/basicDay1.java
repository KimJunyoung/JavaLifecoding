package basic;


import java.util.Scanner;

public class basicDay1 {

	public static void main(String[] args) {
	 /* 강의 1
		int num = 10;
		int bNum = 0b1010; // 2진수
		int oNum = 012;  // 8진수
		int xNum = 0XA; //16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		int cNum = 0b010001;
		
		System.out.println(cNum);
*/
		
		/* 강의 2
		int age, count ;
		age = 10;
		
		int level = 10000;
		*/
		
		/* 강의 3
		byte bs = 101;
		long iVal = 123123123120L;
		*/
		
		/* 강의 4
		char ch1 ='A';
		String chString = "AB"; //문자
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 =66;
		System.out.println(ch2);
		
		int ch3 = 67; //시작은 A=65 즉 67 은 C
		System.out.println(ch3);
		System.out.println((char)ch3); 
		
		char ch5 = '한';
		char ch6 = '\uAC00'; //16진
		
		System.out.println(ch5);
		System.out.println(ch6);
		 */
		
		
		// boolean isMarried = true;
		// System.out.println(isMarried);
		
		/* 강의 5
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		
		*/
		
		/* 강의 6
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 =20;
		float fNum = iNum1;
		
		int ikNum = 10;
		byte bkNum = (byte)ikNum;
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		
		*/
		
		/* 강의 7
		int total = 10;
		int add = 20;
		
		total += add;
		System.out.println(total);
		
		int gameScore = 100;
		int myScore;
		
		myScore = ++ gameScore;
		System.out.println(myScore + "," + gameScore);
		myScore = gameScore ++;
		System.out.println(myScore + "," + gameScore);
		*/
		
		/* 강의 8
		int num1 = 10;
		int i = 2;
		
		System.out.println(((num1 = num1 + 10) > 10) || (i<20));
		*/
		
		/* 강의 9-1
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input1 : ");
		int x = scanner.nextInt();
		System.out.println("input2 : ");
		int y = scanner.nextInt();
		
		max = (x>y) ? x : y ;
		System.out.println(max);
		*/
		
		/* 강의 9-2
		
		int num1 = 5; //  00000101
		int num2 = 10; // 00001010
		double num3 =3.0;
		
		System.out.println(num1 | num2); // 한 비트끼리 비교
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num1 << 3); // 왼쪽은 곱 (2,4,8,16 ...)
		
		System.out.println((num2 >> 2)); // 오른쪽은 나눗셈 (2,4,8...) 정수 자료형만 가
		
		*/
		
		/* 강의 11
		int month = 10;
		int day = switch(month) {
		case 1,3,5,7,8,10, 12 -> {
			
			yield 31;
		}
		case 4,6,9,11 -> {
			
			yield 30;
		}
		case 2 ->{ 
			
			yield 28;
		}
		default ->{
			
			System.out.println("존재하지 않는 달입니다.");
			yield 0;
		}
	};
		System.out.println(month + "월은 " + day + "일입니다.") ;
	}*/


	/* 강의 11-1
	int num = 1;
	int sum = 0;
	
	while(num <=10) {
		sum += num;
		num++;
	}
	
	System.out.println(sum);
	System.out.println(num);
*/
		/*
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
		}while(input != 0);
		
		System.out.println(sum);
		*/
		 
		
		/*
		int count = 1;
		int sum = 0;
		
		for(int i = 0; ; i++) {
			sum += count;
			count ++;
			
			if(count>10){
			break;
		}
		}
		System.out.println(sum);
		
		*/
		
		/*
		int dan = 2;
		int count = 1;
		
		for(int i= 2 ; i<=9; i++) {
			
			for(count = 1; count <=9; count++) {
				System.out.println(i + "x" + count + "=" + i * count);
				
			}
		}
		*/
		/*
		int sum = 0;
		int num;
		for (num = 1; sum <= 100; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
		
		*/
		/*
		int dan = 1;
		int num = 1;
		
		for(dan =1 ; dan <= 9; dan++) {
			for(num = 1; num <= 9; num++) {

				if(num>dan) {
					break;
				}
				System.out.println(dan + "x" + num + "=" + dan*num);
				
			}
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int linecount = (input / 2) + 1;
		int starCount = 1;
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<linecount; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
			for(int j=0; j<linecount; j++) {
				System.out.print(" ");
			}
			
			if( i < input/2) {
				linecount -= 1;
				starCount += 2;
			}else {
				linecount += 1;
				starCount -=2;
			}
			System.out.println();
		}
		
		
	}
	
}
	
		