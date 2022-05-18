package j05_조건;

public class SwitchCase {
	public static void main(String[] args) {
		int num = 29;
		char c = 'a';
		String str = "김준일";
		
		switch(num / 10) {
		case 1: 
			System.out.println("case 1");
			break;
		case 2: 
			System.out.println("case 2");
			break;
		case 3: 
			System.out.println("case 3");
			break;
		default :
			System.out.println("찾을 수 없 음");
		}
		
		switch(c) {
		case 'a':
			System.out.println("case a");
			break;
		case 'b':
			System.out.println("case b");
			break;
		case 'c':
			System.out.println("case c");
			break;
		default :
			System.out.println("찾을 수 없 음");
		}
		
		switch(str) {
		case "김준일":
			System.out.println("case 김준일");
			break;
		case "김준일1":
			System.out.println("case 김준일1");
			break;
		case "김준일2":
			System.out.println("case 김준일2");
			break;
		default :
			System.out.println("찾을 수 없 음");
		}
	}
}
