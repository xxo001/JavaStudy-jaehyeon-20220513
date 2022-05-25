package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	private Scanner sc ;
	
	
	public UserService() {
		sc = new Scanner(System.in);
	}
	
	public User InsertUser() {
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password= null;
		
		System.out.print("사용자번호 입력 : ");
		usercode = sc.nextLine();
		System.out.print("이메일 입력 : ");
		email = sc.nextLine();
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("사용자이름 입력 : ");
		username = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		password = sc.nextLine();
		
		User user = new User(usercode, email, name, username, password);
		return user ;
	}
	
	private void showInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
}
