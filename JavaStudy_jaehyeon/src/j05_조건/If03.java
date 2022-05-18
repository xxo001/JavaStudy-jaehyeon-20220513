package j05_조건;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		score = sc.nextInt();
		sc.close();
		
		if (score > 100 || score < 0) {
			System.out.println("계산 할 수 없는 점수 입니다.");
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
}
