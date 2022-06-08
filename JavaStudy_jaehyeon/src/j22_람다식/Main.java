package j22_람다식;

/*
 *  람다식은 두개이상의 메소드가 있을경우 사용 불가
 */
public class Main {
	public static void main(String[] args) {
		//1.원래 사용했던 인터페이스 생성 방식
		Math2 m2_1 = new Math2Impl();	
		
		//2.익명클래스를 이용한 생성 방식
		Math2 m2_2 = new Math2() {
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};
		
//		3.람다식을 이용한 생성방식 --> 여기서는 calc() 메소드 자체가 익명메소드가 되어버림
//		a)결과가 return밖에 없을때 중괄호({}) 생략
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
//		b)return이외의 명령이 있을시, 중괄호({}) 필요 
//		--> 여기서 중괄호는 클래스의 중괄호가 아닌, 메소드의 중괄호이기 때문에, 내부에 세미콜론 필요
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
			};
			
//		위에서는 생성만되었고, 사용은 따로 해주어야함
		double t = m2_3.calc(10, 3);
		System.out.println(t);
	

	}
}
	
