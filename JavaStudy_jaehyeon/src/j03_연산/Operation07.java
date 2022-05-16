package j03_연산;

public class Operation07 {
	public static void main(String[] args) {
//		 윤년이면 true 아니면 false
//		 ==> 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일때
		int year = 2000;
		
		String result = (year % 400 == 0) ? "윤년" : (year % 100 == 0) ? 
				"윤년이 아닙니다" : (year % 4 == 0) ? "윤년" : "윤년이 아닙니다";
		System.out.println(result);
		
		
		
		/* 다른 풀이
		 * String result = year % 4 == 0 
		 * && year % 100 != 0 
		 * || year % 400 == 0 ? "윤년" : "윤년이 아님"
		 */
	
				
				
				
		
	
	
	
	
	
	

	
	
	
	
		
	}
}
