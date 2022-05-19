package j05_조건;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		1)조건문
		int x = 0;
		int y = 0;
		int c = 0;
		
		System.out.print("좌표를 입력 하세요 : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		scanner.close();
		
		if(x == 0 && y == 0) {
			System.out.println("원점 입니다.");
		}else if (x < -1000 || x > 1000 || y < -1000 || y > 1000 || x == 0 || y == 0 ) {
			System.out.println("잘못된 값입니다.");
		}
		else if(x > 0 && y > 0) {
			c = 1;
		}else if(x < 0 && y > 0) {
			c = 2;
		}else if(x < 0 && y < 0) {
			c = 3;
		}else {
			c = 4;
		}
		if(c != 0) {
			System.out.println(c + " 사분면 입니다.");
		}
		
//		2)삼항연산자
		String result = (x == 0 && y == 0) ? "원점" : (x < -1000 || x > 1000 || y < -1000 || y > 1000 
				|| x == 0 || y == 0) ? "계산불가" : (x > 0 && y > 0) 
				? "1사분면" : (x < 0 && y > 0) ? "2사분면" : (x < 0 && y < 0)
				? "3사분면" : (x > 0 && y < 0) ? "4사분면" : null;
		
		System.out.println(result);
		
//		풀이
//		if((x < -1000 || x > 1000 || y < -1000 || y > 1000 || x == 0 || y == 0)
//				&& (x != 0 || y != 0)) {
//			System.out.println("계산 실패");
//		}else if(x > 0 && y > 0) {
//			System.out.println("1사분면");
//		}else if (x < 0 && y > 0) {
//			System.out.println("2사분면");
//		}else if (x < 0 && y < 0) {
//			System.out.println("3사분면");
//		}else if (x > 0 && y < 0) {
//			System.out.println("4사분면");
//		}else {
//			System.out.println("원점");
//		}
		
		
		
	}
}
