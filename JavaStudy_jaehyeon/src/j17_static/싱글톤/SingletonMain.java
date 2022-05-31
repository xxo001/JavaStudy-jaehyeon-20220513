package j17_static.싱글톤;

import java.security.Signature;

public class SingletonMain {
	public static void main(String[] args) {

		//외부에서 생성하지 못하도록 private 하게 주었기에, 외부에서 생성(new)은 불가
		//getInstance() 를 이용하여, 클래스 내부에서 생성하여 담은 instance를 가지고 와야함
		//여기에서 instance는 Singleton으로 생성된 주소를 담고있음 
		//[singleton / sington2에 들어있는 객체는 공유되어진 같은 객체]	
		Singleton singleton = Singleton.getInstace();
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstace();
		singleton.setCount(20);
		singleton.printInfo();  
		

		 
		
	}
}
