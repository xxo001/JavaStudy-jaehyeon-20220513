package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {
	public static void main(String[] args) {
		//김재현이라는 리터럴 주소를 가져와서 대입하기에, 여기는 true가 나옴
		String name = "김재현";
		String name2 = "김재현";
		
		System.out.println(name == name2);
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1 : ");
		name = scanner.nextLine();
		System.out.print("이름2 : ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		System.out.println();
		
		name = new String("김재현");
		name2 = new String("김재현");
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		
		
		
		
		
	
	}
}
