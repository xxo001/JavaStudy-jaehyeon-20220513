package j08_클래스;
//class [틀]

public class FishBun {
	String material ; //재료
	String dough ;
	
	FishBun(){ //생략되어있는 생성자
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료 : " + material);
		System.out.println("반죽 : " + dough);
	}
}
