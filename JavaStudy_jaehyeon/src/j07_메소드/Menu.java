package j07_메소드;

import java.util.Scanner;

public class Menu {
	
	public static void sleepAndContinue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계속하시려면 엔터를 눌러주세요..");
		sc.nextLine();
		
	}
	
	public static char inputSelect() {
		Scanner sc = new Scanner(System.in);
		char select = 0;
		
		System.out.print("명령을 입력하세요 : ");
		select = sc.next().charAt(0);
		sc.nextLine();
		
		return select;
	}
	
	public static boolean showMenu2() {
		System.out.println("java를 선택하셨습니다.");
		
		while(true) {
			char select = 0;
			
			System.out.println("[java 메뉴]");
			System.out.println("1. java란?");
			System.out.println("b. 뒤로가기");
			System.out.println("q. 프로그램 종료");
		
			select = inputSelect();
			
			if(select == 'b') {
				break;
			}else if(select == 'q') {
				return true;
			}else if(select == '1') {
				System.out.println("자바란 ... 입니다.");
				sleepAndContinue();
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력 하세요.");
				sleepAndContinue();
			}
			
			System.out.println();
		}
		return false;
	}
	
	public static boolean showMenu1() {
		while(true) {
			char select = 0 ;
			
			System.out.println("[메뉴 선택]");
			System.out.println("[1. java]");
			System.out.println("[2. python]");
			System.out.println("[3. javascrpt]");
			System.out.println("[q. 프로그램 종료]");
			
			select = inputSelect();

			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				//if안에있는 showMenu2가 먼저 실행되고, true가 리턴될시, 종료됨
				if(showMenu2()) {
					return true;
				}
			}else if(select == '2') {
				System.out.println("python을 선택하셨습니다.");
			}else if(select == '3') {
				System.out.println("javascript를 선택하셨습니다.");
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력해 주세요.");
				sleepAndContinue();
			}
			System.out.println();
			
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		showMenu1();
		
		System.out.println("프로그램 종료");
		
	}

}
