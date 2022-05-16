package j03_연산;

public class Operation03 {
	public static void main(String[] args) {
		/* 1)
		 * year  =  1999 (윤년x)
		 * 년도가 4의 배수이면 true 아니면 false
		 * 
		 * 2)
		 * year = 2000 (윤년)
		 * 윤년이면 true 아니면 false
		 * ==> 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일때
		 * 
		 * 
		 * 
		 */
		int year;
		int year2;
		boolean result ;
		boolean result1 ;
		
		//1)
		year = 1999;
		result = ((year % 4) == 0);
		System.out.println(result);
		
		//2)
		year2 = 2000;
		result1 =((year2 % 4 == 0) && (year2 % 100 != 0)) 
				|| (year2 % 400 == 0);
		System.out.println(result1);
	}
}
