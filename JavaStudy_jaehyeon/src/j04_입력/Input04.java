package j04_입력;

import java.util.Scanner;

public class Input04 {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner sc  = new Scanner(System.in);
		
		String a = null;
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		
		System.out.println("[영화정보 입력]" );
		System.out.print("개요 : " );
		a = sc.nextLine();
		System.out.print("감독 : " );
		b = sc.nextLine();
		System.out.print("등급 : " );
		c = sc.nextLine();
		System.out.print("흥행 : " );
		d = sc.nextLine();
		System.out.print("줄거리 : " );
		e = sc.nextLine();
		f = sc.nextLine();
		
		System.out.println("[영화정보 출력]" );
		System.out.println("개요 : " + a);
		System.out.println("감독 : " + b);
		System.out.println("등급 : " + c);
		System.out.println("흥행 : " + d);
		System.out.println("줄거리 : " + e + "\n" + f);

		
		

		

		
		
		
	}
}
