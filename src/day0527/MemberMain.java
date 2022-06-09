package day0527;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.setName("김그린");
		m.setTel("010-1111-2222");
		m.setAddress("성남");
		
		System.out.println(m.getName());
		System.out.println(m.getTel());
		System.out.println(m.getAddress());
	}

}
