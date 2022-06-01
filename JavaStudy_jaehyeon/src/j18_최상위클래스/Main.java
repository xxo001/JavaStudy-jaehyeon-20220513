package j18_최상위클래스;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("김준일" , "웹개발");
		Teacher t2 = new Teacher("김준일" , "웹개발");

		//t1의 클래스인 Teacher가 Object를 상속받았다는 뜻
//		Object obj = t1; //업캐스팅 가능(Object로 상속 또는 구현이 되었음)
		
		//생략해도 toString()이 호출
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		
		

	}
}
