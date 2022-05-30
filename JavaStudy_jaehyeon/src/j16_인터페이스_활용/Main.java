package j16_인터페이스_활용;

import j16_인터페이스_활용.controller.ApiController;
import j16_인터페이스_활용.service.AuthUserService;
import j16_인터페이스_활용.service.OAuth2UserService;

public class Main {
	public static void main(String[] args) {
		ApiController companyA  = new ApiController(new OAuth2UserService());
		companyA.addUser();
		companyA.getUser();
		companyA.modifiUser();
		companyA.removeUser();
	}
}
