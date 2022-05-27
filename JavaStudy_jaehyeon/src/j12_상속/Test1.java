package j12_상속;

public class Test1 extends Test {
	public Test1() {
//		super(); //생략되어있는 부분 [부모클래스 생성]
		System.out.println("T1 생성자 호출");
		System.out.println("T1 에서 확인 : " + super.toString());
	}
	
}
