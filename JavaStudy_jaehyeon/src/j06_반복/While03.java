package j06_반복;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		/*
		 * 반복 횟수를 입력하세요 : 
		 */
		int num = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복 횟수를 입력하세요 : ");
		num = sc.nextInt();
		
//		1) 
//		입력수 만큼 1부터 반복
		while(i < num) {
			System.out.println(i+1);
			i++;
		}
		i = 0;
//		2) 
//		입력수 만큼 입력 수 부터 하강
		while(i < num) {
			System.out.println(num - i);
			i++;
		}
		i = 0;
//		3)

	}
}









