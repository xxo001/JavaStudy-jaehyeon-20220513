package j23_예외처리;

import javax.management.RuntimeErrorException;

public class ThrowsEx {
	public static void main(String[] args) {
		try {
			System.out.println("프로그램 실행중");
			int i = 10;
			
			if(i == 0) {
				throw new ValidationCustomException("예외발생");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
	}
}
