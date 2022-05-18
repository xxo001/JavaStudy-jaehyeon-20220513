package j04_입력;

import java.util.Scanner;

public class Input02 {
	public static void main(String[] args) {
		/*
		 * 문자열 1 입력 : nextLine()			hi
		 * 문자열 2 입력 : next()				안녕
		 * 문자 입력 : next.charAt(0)			A
		 * 정수 입력 : nextInt()				10
		 * 실수 입력 : nextDouble()				3.14
		 */
		Scanner scanner = new Scanner(System.in);
		String hi_1 = null;
		String hi_2 = null;
		char c = 0;
		int	i = 0;
		double d = 0.0;
		
		System.out.print("문자열1 입력 : ");
		hi_1 = scanner.nextLine();
		System.out.print("문자열2 입력 : ");
		hi_2 = scanner.next();
		System.out.print("문자 입력 : ");
		c = scanner.next().charAt(0);
		System.out.print("정수 입력 : ");
		i = scanner.nextInt();
		System.out.print("실수 입력 : ");
		d = scanner.nextDouble();
		
		System.out.println(hi_1);
		System.out.println(hi_2);
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		
	}
}
