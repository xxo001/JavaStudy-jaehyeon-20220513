package j04_입력;

import java.util.Scanner;

public class Input05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int num1 = 0;
		
		System.out.print("두 수를 입력 하세요 : ");
		num = sc.nextInt();
		num1 = sc.nextInt();
		System.out.println("결과 : " + (num + num1));
		System.out.println(num > num1 ? ">" 
				: num < num1 ? "<" : "");

		
	}
}
