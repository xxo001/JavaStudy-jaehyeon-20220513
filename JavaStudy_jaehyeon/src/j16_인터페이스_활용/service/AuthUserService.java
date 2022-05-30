package j16_인터페이스_활용.service;

public class AuthUserService implements UserService {

	@Override
	public void creat() {
		System.out.println("자회사 회원가입");
	}

	@Override
	public void read() {
		System.out.println("자회사 회원가입을 통해 사용자 데이터 가져오기");
	}

	@Override
	public void update() {
		System.out.println("자회사 회원 정보 수정");
	}

	@Override
	public void delete() {
		System.out.println("자회사 회원 탈퇴");	
	}
	
}
