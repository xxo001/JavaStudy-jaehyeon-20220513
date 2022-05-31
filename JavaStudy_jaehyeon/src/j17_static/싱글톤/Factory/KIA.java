package j17_static.싱글톤.Factory;

public class KIA {
	//getInstance()에서 null일경우 생성해주기에, 굳이 초기화 시켜주지 않아도 됨
	private static KIA instance;
	private int serial_auto_increment = 20220000;
	
	private KIA() {}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serial_auto_increment, KIA.class.getSimpleName(), model);
	}

	public void carInfo(Car car) {
		System.out.println(car.toString());
	}
}
