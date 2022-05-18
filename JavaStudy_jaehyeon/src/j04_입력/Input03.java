package j04_입력;

import java.util.Scanner;

public class Input03 {
	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름 : 김재현
		 * 나이 : 26
		 * 연락처 : 010-6610-6518
		 * 주소 : 부산 부산진구 범천동
		 * 성별 : 남
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		String phone = null;
		String adress = null;
		int age = 0;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름 : ");
		name = sc.next();		
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("연락처 : ");
		phone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		adress = sc.nextLine();
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);

		System.out.println("\n[개인정보 출력]");
		System.out.println("이름 : " + name);
		System.out.println("나이 : "+ age);
		System.out.println("연락처 : "+ phone);
		System.out.println("주소 : "+ adress);
		System.out.println("성별 : "+ gender);
		
	}
		
}
