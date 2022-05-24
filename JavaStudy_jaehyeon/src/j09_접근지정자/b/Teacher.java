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
		String _address = name + "님: " + address;
		String _phone = name + "님: " + phone;
		
		System.out.println(_address);
		System.out.println(_phone);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
