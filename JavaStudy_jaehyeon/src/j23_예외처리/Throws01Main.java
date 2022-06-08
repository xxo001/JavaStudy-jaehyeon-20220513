package j23_예외처리;

public class Throws01Main {
	public void test() {			
		Throws01 throws01 = new Throws01();
		
		try {
			throws01.printarray(new int[] {1,2,3,4,5,6,7,8,9});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Throws01Main main = new Throws01Main();
		main.test();
	}
}
