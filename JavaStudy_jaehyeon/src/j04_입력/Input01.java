package j04_입력;

import java.util.Scanner;

public class Input01 {
	public static void main(String[] args) {
		int result ;
		boolean year ;

		Scanner scanner = new Scanner(System.in);
		
//		1) 입력 실습
		System.out.print("첫번째값 입력 : ");
		int num = scanner.nextInt();
		System.out.print("두번째값 입력 : ");
		int num1 = scanner.nextInt();
		System.out.println("입력한 값 : " + (num + num1));
		

//		2) 윤년 입력
		System.out.print("년도를 입력해 주세요 : ");
		result = scanner.nextInt();
		year = ((result % 4 == 0) && (result % 100 != 0)) 
				|| (result % 400 == 0);
		
		System.out.println(year);
		
		
		
		scanner.next();					//문자열(String)
		scanner.nextLine();				//문자열(String)
		scanner.next().charAt(0);		//문자(char)
		scanner.nextInt();				//정수(int)
		scanner.nextDouble();			//실수(double)
		
		

		

		
		
		
		
		
		
		
		
		
		scanner.close();
	}
}
