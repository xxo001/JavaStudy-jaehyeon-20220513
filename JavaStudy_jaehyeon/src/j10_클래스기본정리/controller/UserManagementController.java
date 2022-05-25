package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	//공통사용하는 userservice를 전역으로 선언
	private UserService userservice ;
	
	public UserManagementController(UserService userService) {
		//선언만 전역으로 하되, 생성은 기본생성자 안에서 생성되도록 함
		this.userservice  = userService;
	}
	
	public void creatUser() {
		User user =  userservice.InsertUser();
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}

	
	public void updateUser() {
		
	}

	
	
}
