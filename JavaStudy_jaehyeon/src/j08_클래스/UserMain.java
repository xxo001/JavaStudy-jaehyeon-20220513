package j08_클래스;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println("첫번째:"+user1.name);
		System.out.println("메인메소드 에서 호출 : " + user1);
		user1.name = "김재현";
		System.out.println("두번째:"+user1.name);
		user1.setName("aaaa");
		System.out.println("세번째:"+user1.name);
		
		User user2 = new User("김재현2","26","01066106518","부산진구 범천동");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);
	}
}
