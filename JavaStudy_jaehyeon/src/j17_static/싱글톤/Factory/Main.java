package j17_static.싱글톤.Factory;

public class Main {
	public static void main(String[] args) {
		KIA kia1 = KIA.getInstance();
		KIA kia2 = KIA.getInstance();
		KIA kia3 = KIA.getInstance();
		
		Car k5_01 = kia1.createCar("k5");
		Car k5_02 = kia1.createCar("k5");
		
		kia1.carInfo(k5_01);
		kia1.carInfo(k5_02);
		
		Car k7_01 = kia2.createCar("k7");
		Car k7_02 = kia2.createCar("k7");
		
		kia1.carInfo(k7_01);
		kia1.carInfo(k7_02);
	}
}
