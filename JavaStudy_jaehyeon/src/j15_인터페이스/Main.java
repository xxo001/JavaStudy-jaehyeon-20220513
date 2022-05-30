package j15_인터페이스;

public class Main {
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		//monitor 와 beamProjector를 hdmi로 업캐스팅 하면서, smartPhone을 생성
		SmartPhone phone = new SmartPhone(monitor);
		phone.powerOn();
		phone.powerOff();
	}
}
