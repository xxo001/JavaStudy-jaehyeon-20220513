package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Scanner;

import lombok.val;

public class HashMapEx2 {
	public static void main(String[] args) {
		/*
		 * 자동차 -> car
		 * 자전거 -> bicycle
		 * 기차 -> train
		 * 비행기 -> airplane
		 * 
		 * 지원하지 않는 단어입니다.
		 */
		String value = null;
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> a = new HashMap<String, String>();
		
		a.put("자동차", "car");
		a.put("자전거", "bicycle");
		a.put("기차", "train");
		a.put("비행기", "ariplane");
		a.put("오토바이", "motocycle");
		
		System.out.print("단어를 입력하세요 : ");
		value = sc.nextLine();
		
		if(a.containsKey(value)) {
			System.out.println(a.get(value));
		}else {
			System.out.println("지원하지 않는 단어입니다.");
		}
		
//		if문을 사용한다면, 번거롭고 유지보수가 힘듦
//		boolean flag = true;
//		while(flag) {
//			if(value.equals("자동차")) {
//				System.out.println("Car");
//			}else if(value.equals("자전거")) {
//				System.out.println("bicycle");
//			}else if(value.equals("기차")) {
//				System.out.println("train");
//			}else if(value.equals("비행기")) {
//				System.out.println("airplane");
//			}else {
//				System.out.println("지원하지 않는 단어입니다.");
//				System.out.println("종료합니다.");
//				flag = false;
//			}
//		}
		
		
		
		
		
	}
		
}
