package j14_추상;

public class FactoryMain2 {
	public static void main(String[] args) {
		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop();
		
		
		//추상클래스는 생성이 불가
//		Factory factory = new Factory()
		
		
		SamsungFactory samsungFactory = new SamsungFactory();
		samsungFactory.start();
		samsungFactory.stop();
	}
}
