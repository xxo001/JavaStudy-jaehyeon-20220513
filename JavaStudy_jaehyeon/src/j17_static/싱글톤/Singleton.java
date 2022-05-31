package j17_static.싱글톤;


/*
 * 싱글톤
 * 1. 생성자는 private --> 외부에서 생성 불가
 * 2. 싱글톤으로 설계된 클래스의 유일한 인스턴스를 return 해줄 수 있는 
 *    getInstance() static 메소드가 존재해야 함  --> 외부에서 getInstance()를 통해 객체를 사용 가능
 * 3. 싱글톤 인스턴스를 저장할 변수명이 instance인 static 변수가 존재해야 함 
 * --> 변수명이 static이어야, getInstance()에서 사용이 가능
 * 
 */

public class Singleton {
	private static Singleton instance = new Singleton();
	private int count;
	
	
	private Singleton() {}
	
	
	
	public static Singleton getInstace() {
		//만일 메모리 공간부족으로 생성되지 않는다면, 생성하도록 조건을 걸어둠
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	
	public void printInfo() {
		System.out.println("싱글톤 테스트" + count);
	}

}
