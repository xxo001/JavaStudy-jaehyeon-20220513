package j06_반복;

public class GuGuDan {
	public static void main(String[] args) {
		System.out.println("구구단 시작\n");
		
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "단 시작]");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j +  " = " + (i*j));
				
			}
			System.out.println("-----------------------------");
			
		}
	}
}
