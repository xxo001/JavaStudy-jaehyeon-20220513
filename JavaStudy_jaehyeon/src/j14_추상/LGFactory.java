package j14_추상;

public class LGFactory extends Factory {
	@Override
	public void start() {
		System.out.println("LG팩토리 가동");
	}
	@Override
	public void stop() {
		System.out.println("LG팩토리 멈춤");
	}
	
	
}
