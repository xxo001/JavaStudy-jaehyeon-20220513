package j13_다형성;

public class FactoryMain {
	public static void main(String[] args) {
		//클래스들을 업캐스팅 했기때문에, 자료형이 같아짐
		//배열로 묶을수 있음
		Factory[] factorys = new Factory[5];
		
		//클래스의 업캐스팅
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();
		
		
		
	}
}
