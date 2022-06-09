package package2;

import packages1.A;

public class D {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.pub);
//		System.out.println(a.pro); //같은 패키지, 다른 패키지 자손 클래스 즉, A를 상속받지 않았기 때문에 에러
//		System.out.println(a.def); //같은 패키지가 아니라서 에러
//		System.out.println(a.pri); //같은 클래스가 아니라서 에러
		
	}
	
}
