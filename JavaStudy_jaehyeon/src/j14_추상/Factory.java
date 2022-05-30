package j14_추상;

/*
 *  abstract 추상
 *  
 *  [추상메소드]
 *  return type 앞에 abstract를 선언해주고 바디를 지워주는 형태
 * 	추상메소드 는 일반 클래스 안에 선언 불가
 *  상속 또는 구현된 하위 클래스에서 무조건 override 가 되어야 함
 *  
 *  [추상클래스]
 *  Class type 앞에 abstract로 선언 해주는 형태
 *  추상 클래스는 생성(new) 할 수 없음
 *  추상 메소드를 포함할 수 있음(필수는 아님)
 *  
 *  
 */


//추상 클래스
public abstract class Factory {
	//추상 메소드
	public abstract void start();
	public abstract void stop();
}
