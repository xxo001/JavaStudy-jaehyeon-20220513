package j12_상속.동물;
/*
 * @ 는 어노테이션을 의미
 * 
 * 
 * @Override(재정의)
 * 상위클래스의 메소드를 재정의 하겠다는 의미
 */
public class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	

}
