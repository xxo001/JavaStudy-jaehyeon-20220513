package j23_예외처리;
/*
 * 프로그램의 오류
 * 1. 예외 (프로그램이 실행 중 일 때 에러)
 * 2. 컴파일 중 오류 -> ex) 드라이버
 * 3. 버그 (외부로부터 어떠한 작용을 받았을 때 에러)
 * 
 */

public class ArrayException01 {
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		try {
			for (int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + " : " + numbers[i]);
			}			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("IndexOutOfBoundsException 예외가 발생 하였음");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}
}
