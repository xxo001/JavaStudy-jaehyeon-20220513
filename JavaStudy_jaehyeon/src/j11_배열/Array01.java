package j11_배열;

public class Array01 {
	public static void main(String[] args) {
		//배열 선언법
		//1. 배열의 공간을 정해서 생성
		int[] numbers = new int[10];
		String[] strArray = new String[5];
		
		//2. 배열을 생성할때 값을 미리 지정
		int[] numbers2 = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10};
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, true, true,};
		
		
		System.out.println("numbers의 길이 : " + numbers.length);
		System.out.println("strArray의 길이 :" + strArray.length);
		
		
		
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.print("numbers : "+numbers[i]+ " ");
			System.out.println("numbers2 : "+numbers2[i]);
		}
		for (int i = 0; i < strArray.length ; i++) {
			System.out.println(strArray[i]);			
		}
		

	}
}
