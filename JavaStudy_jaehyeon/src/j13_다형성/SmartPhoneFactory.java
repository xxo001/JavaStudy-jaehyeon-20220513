package j13_다형성;

public class SmartPhoneFactory extends Factory {
	@Override
	public void start() {
		System.out.println("스마트폰 공장을 가동합니다.");
	}
	
	public void showSmartPhone() {
		System.out.println("스마트 폰들을 확인 합니다.");
	}
}
