package j23_예외처리;

import java.util.ArrayList;

public class CompanyMain {
	/*
	 * 1.printCompanies() 메소드에서 예외를 미룬다(throws)
	 * 2.printCompanies() 메소드를 호출한 지점에서 예외 처리를 함
	 * 3.NullPointException 처리를 함. 메세지내용 : 해당 주소에는 Company객체가 없음
	 * 4.finally 회사정보출력완료
	 * 
	 */
	
	public void printCompanies(ArrayList<Company> companies) throws Exception {
		for(Company company : companies) {
			System.out.println("회사명 : " + company.getName());
			System.out.println("주소 : " + company.getAdress());
			System.out.println("----------------------------");
		}
	}
	
	public static void main(String[] args) {
		CompanyMain companyMain = new CompanyMain();
		ArrayList<Company> companies = new ArrayList<Company>();
		
		companies.add(new Company("LG", "구미"));
		companies.add(new Company("삼선전자", "부산"));
		companies.add(new Company("Apple", "실리콘벨리"));
		companies.add(null);
		companies.add(new Company("google", "실리콘벨리"));
		
		try {
			companyMain.printCompanies(companies);
		} catch (NullPointerException e) {
			System.out.println("해당 주소에는 Company 객체가 없음");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("회사정보 출력 완료");
		}

		System.out.println("프로그램 종료");
	}
	
	
	
}
