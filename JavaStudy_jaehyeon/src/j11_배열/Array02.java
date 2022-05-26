package j11_배열;

import java.util.Iterator;

public class Array02 {
	public static void main(String[] args) {
//		int size = 4;
//		int[] numbers = new int[size];
//		System.out.println(numbers.length);
		
		/*
		 * for 문으로 0~99까지 반복
		 * 변수i의 값이 8의 배수이면, 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다
		 * 배열에 들어있는 8의 배수들을 모두 출력 하시오.
		 * 
		 */
		
//		내가한거
		for(int i  = 0 ; i < 100; i++) {
			if(i !=0 && i % 8 == 0) {
				int size = i/8;
				int[] x = new int[size];
				for(int j=0 ; j < x.length ; j++) {
					x[j] = (j+1)*8;
					System.out.println(x[j]);
				}
				System.out.println(" ");
			}
		}
		
		
//		강사님 풀이
//		int size = 0;
//		
//		for(int i = 0; i<100; i++) {
//			if(i != 0 && i % 8 == 0) {
//				size++;
//			}
//		}
//		int[] y = new int[size];
//		
//		for (int i = 0, j = 0; i < 100 ; i++) {
//			if(i != 0 && i % 8 == 0) {
//				y[j] = i;		
//				j++;
//			}
//		}
//		
//		for (int i = 0; i < y.length; i++) {
//			System.out.println(y[i]);
//		}
	}
}
