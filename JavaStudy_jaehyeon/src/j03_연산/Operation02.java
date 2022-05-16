package j03_연산;

/*
 * 논리 연산자
 * 
 * 1) AND => &&  - 곱 
 * ==> 모든 조건이 참일때만, True
 * ==> 하나라도 거짓일때, False
 * 
 * 2) OR => ||	- 합 ==> 
 * ==> 모든 조건이 거짓일때, false
 * ==> 하나의 조건이라도 참이어도, true
 * 
 * 3) NOT => ! - 부정(반전)
 * ==> !(t && t) => f
 * ==> !(f || f) => t
 * ==> !(t || f) => f
 * 
 * 
 * 
 * ex)
 * 0(False)
 * !0(true)
 * 
 * t(1) && t(1) = t(1)
 * t(1) && f(0) = f(0)
 * 
 * 
 * t(1) || t(1) = t(2)
 * t(1) || f(0) = t(1)
 * f(0) || f(0) = f(0)
 * 
 * 
 */

public class Operation02 {
	
	public static void main(String[] args) {
		int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1 : "+result2);
		System.out.println("result2 : "+result1);
		
		System.out.println("result1 AND result2 : "+ (result1 && result2));
		
		
		

		
		
	}
}
