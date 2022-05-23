package j08_클래스;

public class Car {
	String company;
	String model;
	String color;
	
	void showCompanyInfo() {
		System.out.println(model + " 차량은 " + company + " 회사에서 제조된 차량입니다.");
		
	}
	
	void showInfoAll() {
		System.out.println("회사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		
	}

	String getCar() {
		return company + "_" + model + "_" + color;
	}
	
	void setCar(String color1) {
		color = color1 ;
		
	}
	
	
	

}
