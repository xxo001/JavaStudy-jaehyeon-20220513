package j08_클래스;
/*
 * 1.Car 클래스를 만든다
 * 2.Car 클래스의 속성(변수) > 제조사(company), 모델명(model1), color(색상)
 * 3.Car 클래스의 기능(메소드) > 
 * showCompynyInfo() --> 000회사에서 제조된 차량입니다.
 * showInfoAll() --> 제조사 : xxx	 모델명 : xxx	color : xxx
 * getCar() --> return "kia_k5_화이트"
 * setColor() --> 매개변수에 색상을 받아서 color변수의 값을 변경
 * 
 * 세대의 자동차 만들기 
 * kia k7 블랙(블루)
 * 현대자동차 소나타 화이트(그레이)
 * tesla model3 레드(그린)
 * 
 */

public class CarMain {
	public static void main(String[] args) {
		Car k7 = new Car();
		Car sonata = new Car();
		Car model3 = new Car();
		
		//k7정보
		k7.company = "KIA";
		k7.model = "K5";
		k7.color = "블랙";
		//sonata정보
		sonata.company = "현대자동차";
		sonata.model = "SONATA";
		sonata.color = "화이트";
		//model3정보
		model3.company = "Tesla";
		model3.model = "Model3";
		model3.color = "레드";
		
		System.out.println("[회사 정보]");
		k7.showCompanyInfo();
		sonata.showCompanyInfo();
		model3.showCompanyInfo();
		
		System.out.println("\n[차량 정보]");
		k7.showInfoAll();
		sonata.showInfoAll();
		model3.showInfoAll();
		
		System.out.println("[색상 변경]");
		k7.setColor("블루");
		sonata.setColor("그레이");
		model3.setColor("그린");
		
		System.out.println(k7.getCar());
		System.out.println(sonata.getCar());
		System.out.println(model3.getCar());
	}
}
