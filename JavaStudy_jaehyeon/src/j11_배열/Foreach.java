package j11_배열;

public class Foreach {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		for (int i = 0; i < numbers.length; i++) {
			if(i == (numbers.length-1) ) {
				System.out.println(numbers[i]);
			}else {
				System.out.print(numbers[i]+", ");				
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((i == numbers.length -1) ? numbers[i] : numbers[i]+", ");
		}
		System.out.println(" ");
		
		
		//Foreach문으로 변경
		for(int num : numbers) {
			System.out.print(num + ((num == 8) ? "":", "));	
		}
	}
}
