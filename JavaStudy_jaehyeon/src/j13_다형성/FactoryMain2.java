package j13_다형성;

public class FactoryMain2 {
	public static void main(String[] args) {
		Factory[] factorys = new Factory[100] ;
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
		
		for (int i = 0; i < factorys.length; i++) {
			//삼항연산자 [조건연산자]
			factorys[i] = (i%2==0) ? new SmartPhoneFactory() : new ComputerFactory();
			
		}
		for(Factory factory : factorys) {
			factory.start();
		}
		
		System.out.println();
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory ;	
				spf.showSmartPhone();
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cpf = (ComputerFactory) factory ;
				cpf.showComputer();
			}else {
				System.out.println("다운 캐스팅 할 수 없습니다.");
			}
			
		}
	
		
	}
}
