package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	//공통사용하는 userservice를 전역으로 선언
	private UserService userservice ;
	private User[] users;
	
	public UserManagementController(UserService userService) {
		//선언만 전역으로 하되, 생성은 기본생성자 안에서 생성되도록 함
		this.userservice  = userService;
		users = new User[2];
	}
	
	public void creatUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] =  userservice.InsertUser();			
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		}else {
			System.out.println("더이상 사용자를 추가할수 없습니다.");
		}
		
	}
	
	private int findEmptyInUsers() {
		for(int i=0 ; i < users.length ; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		
		return -1;
	}

	
	public void updateUser() {
		
	}

	
	
}
