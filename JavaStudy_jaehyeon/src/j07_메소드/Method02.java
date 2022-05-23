package j07_메소드;

public class Method02 {
	//매개변수도 없고, 반환도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 실행");
	
	}
	//매개변수는 있고, 반환이 없는 메소드
	public static void test2 (int age, int year) {
		System.out.println("나이 : " + age);
		System.out.println("출생년도 :"+ year);
		
	}
	//매개변수가 없고 반환이 있는 메소드
	public static String test3() {
		return "김재현";
	}
	
	public static int test4() {
		return 10000;
	}
	//매개변수도 있고, 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
	}
	
	//리턴자료형이 void일때, 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
		System.out.println("test6이 정상 종료 되었습니다.");
	}
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1();
		test2(29 , 1994);
		String name = test3();
		System.out.println(name);
		System.out.println(test5("김재현" , 1));
		test6();
		System.out.println("메인함수 끝");
	}
}
