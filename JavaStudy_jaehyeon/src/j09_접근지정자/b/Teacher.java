package j09_접근지정자.b;

public class Teacher {
	private String name;
	private String address;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		String _address = creatMassege(name, address);
		String _phone = creatMassege(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
	}
	private String creatMassege(String name, String value) {
		return name + "님: " + value;
				
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
