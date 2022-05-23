package j08_클래스;

public class FishBunMain {
	public static void main(String[] args) {
		//생성자를 통해 생성하는 순간, 오브젝트 에서 인스턴스가 됨
		FishBun fishbun = new FishBun(); //객체 생성
		
		fishbun.showInfo();
		fishbun.material = "팥";
		fishbun.dough = "부드러운 반죽";
		fishbun.showInfo();
		
		System.out.println("====================");
		
		FishBun fishbun2 = new FishBun(); //객체 생성
	
		fishbun2.showInfo();
		fishbun2.material = "슈크림";
		fishbun2.dough = "퍽퍽한 반죽";
		fishbun2.showInfo();
		fishbun.showInfo();
		
		System.out.println(fishbun);
		System.out.println(fishbun2);
	}
}
