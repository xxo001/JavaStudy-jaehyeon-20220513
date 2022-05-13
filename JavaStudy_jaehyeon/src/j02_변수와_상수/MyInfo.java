package j02_변수와_상수;

public class MyInfo {
	public static void main(String[] args) {
		// 주석
		/*
		 * 메모 , 필기
		 * 1. 문제
		 * name1,name2,name3
		 * age(나이)
		 * phone(연락처)
		 * adress(주소)
		 *
		 */
		char name1 = '김', name2 = '재',name3 = '현';
		int age = 26;
		String phone = "010-6610-6518";
		String adress = "부산 부산진구 범천동";
		
		System.out.print("이름: "+ name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.println("나이 : "+ age);
		System.out.println("전화번호 : "+ phone);
		System.out.println("주소 : "+ adress);
		//형변환
		System.out.println("이름 : " + name1 + name2 + name3);
		System.out.println("");
		
		System.out.println("세수의 합 : " + (10 + 20 + 30));
		
	}
}
