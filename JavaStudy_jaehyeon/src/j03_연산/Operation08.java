package j03_연산;

import java.util.Scanner;

public class Operation08 {
	public static void main(String[] args) {
		/*
		 * num = 10
		 * 
		 * num이 짝수면 짝수, 홀수면 홀수 를 출력
		 * +
		 */
		int num ;
		String result ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		num = scanner.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수" );
		
		scanner.close();
		
		
	}
}
