package j06_반복;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[메뉴선택]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.println("명령을 입력하세요 : ");
			select = sc.next().charAt(0);
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				System.out.println("java를 선택 하셨습니다.");
				while(true) {
					System.out.println("[java메뉴]");
					System.out.println("1, java란");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					
					System.out.println("명령을 입력해 주세요. : ");
					select = sc.next().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
						break;
					}else if(select == '1') {
						System.out.println("java란 ... 입니다.");
						System.out.println("계속 하시려면 엔터를 눌러주세요.");
						sc.nextLine();
					}else {
						System.out.println("잘못 입력 하셨습니다.");
						System.out.println("다시 입력 하세요.");
					}
					
					System.out.println();
				}
				
			}else if(select == '2') {
				System.out.println("python를 선택 하셨습니다.");
			}else if(select == '3') {
				System.out.println("javascript를 선택 하셨습니다.");
			}else {
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("다시 입력 하세요.");
			}
			
			System.out.println();
		
		}
		
		System.out.println("프로그램 종료");
	}
}
