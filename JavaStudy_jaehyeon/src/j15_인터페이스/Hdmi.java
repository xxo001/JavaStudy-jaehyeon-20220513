package j15_인터페이스;
/*
 * 인터페이스 (interface)
 * 
 * 약속
 * 1. 기본적으로 모든 메소드는 추상 메소드임
 * 2. 일반 메소드를 사용하기위해선, return type앞에 default 키워드를 선언
 * 
 */
public interface Hdmi {
	public void connect();
	public void disconnect();
}
