package day0527;

public class Member {
	private String name;
	private	String tel;
	private String address;
	
	//인스턴스 변수의 값을 읽어오는 메서드 이름 : get변수이름
	//변수의 값을 변경하는 메서드 이름 : set변수이름
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printMember() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
